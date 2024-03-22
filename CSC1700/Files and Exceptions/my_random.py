import random

def main():
	outfile = open("sales.txt", "w")
	for _ in range(10):
		number = random.randint(100, 1000)
		outfile.write(f"{number}\n")
	outfile.close()

main()