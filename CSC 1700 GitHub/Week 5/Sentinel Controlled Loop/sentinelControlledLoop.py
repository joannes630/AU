# Keep asking the user to enter words until they type "stop".

word = input("Enter a word (type 'stop' to quit): ")
while word != "stop":
    word = input("Enter a word (type 'stop' to quit): ")
print("Loop ended.")