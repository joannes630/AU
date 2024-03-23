def area(width, length):
    return width * length

def perimeter(width, length):
    return 2 * (width + length)

def main():
    my_perimeter = perimeter(5, 6)
    print(f"In {__name__}, perimeter is: {my_perimeter}")

print(f"The module name is {__name__}")
if __name__ == "__main__":
    main()
