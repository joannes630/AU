import requests
from bs4 import BeautifulSoup

url = "https://www.amazon.com/s?k=wireless+mouse"

response = requests.get(url, timeout=10)

soup = BeautifulSoup(response.text, "html.parser")

products = soup.select("div[data-component-type='s-search-result']")

for product in products:
    title = product.select_one("h2")
    price = product.select_one(".a-price .a-offscreen")

    if title and price:
        print(title.get_text(strip=True))
        print(price.get_text(strip=True))
        print()