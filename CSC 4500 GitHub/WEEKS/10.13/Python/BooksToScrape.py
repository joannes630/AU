from bs4 import BeautifulSoup
import lxml
import requests
import requests
from bs4 import BeautifulSoup

# URL of the webpage to scrape
url = 'http://books.toscrape.com/'

# Fetch the content from the URL
response = requests.get(url)

# Check if the request was successful (status code 200)
if response.status_code == 200:
    # Parse the content with BeautifulSoup
    soup = BeautifulSoup(response.text, 'html.parser')

    # Find all books and their prices
    books = soup.find_all('article', class_='product_pod')

    # Loop through each book and extract the title and price
    for i, book in enumerate(books):
        # Extract the title
        title = book.h3.a['title']

        # Extract the price
        price = book.find('p', class_='price_color').get_text()

        print(f"Book {i + 1}: {title} - Price: {price[1:]}")
else:
    print(f"Failed to retrieve the webpage. Status code: {response.status_code}")