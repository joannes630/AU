import requests
import re
from bs4 import BeautifulSoup, Tag, NavigableString
from urllib.parse import urljoin

url = "https://www.adafruit.com/new"

response = requests.get(url)
response.raise_for_status()

soup = BeautifulSoup(response.text, "html.parser")

# Find product links within H2 headings
products = soup.select("h2 a[href]")

# Create a CSV file
file = open("products.csv", "w")
file.write("ProductID,ProductName,Price,Status, Quantity\n")
file.close()

# Append records to the CSV file
file = open("products.csv", "a")
for product in products:
    link = product["href"]

    match = re.fullmatch(r"/product/(\d+)", link)

    if match:
        # Get product ID
        product_id = int(match.group(1))

        # Get product name
        name = product.get_text(strip=True)
        name = name.replace("\"", "")
        name = name.encode("ascii", errors="ignore").decode("ascii")

        # Get the H2 heading
        heading = product.find_parent("h2")

        # Collect text until the next product heading
        text_parts = []

        for element in heading.next_elements:

            if isinstance(element, Tag) and element.name == "h2":
                break

            if isinstance(element, NavigableString):
                text = element.strip()
                if text:
                    text_parts.append(text)

        text = " ".join(text_parts)

        # Extract price
        price_match = re.search(r"\$\s*[\d,]+\.\d{2}", text)

        if price_match:
            price = price_match.group().replace(" ", "")
            price = price.replace("$", "")
        else:
            price = "N/A"

        # Extract inventory information
        stock_match = re.search(r"([\d,]+)\s+in stock", text, re.I)

        if stock_match:
            status = "In Stock"
            quantity = int(stock_match.group(1).replace(",", ""))

        elif re.search(r"Out of stock", text, re.I):
            status = "Out of Stock"
            quantity = 0

        elif re.search(r"\bIn stock\b", text, re.I):
            status = "In Stock"
            quantity = "Not specified"

        else:
            status = "Unknown"
            quantity = "Unknown"

        print("Product ID:", product_id)
        print("Product:", name)
        print("Price:", price)
        print("Status:", status)
        print("Quantity:", quantity)
        print("URL:", urljoin(url, link))
        print()

        file.write(f"{product_id},\"{name}\",{price},{status},{quantity}\n")
file.close()