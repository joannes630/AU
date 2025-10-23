def decode(text):
    alphabet = 'abcdefghijklmnopqrstuvwxyz'
    reversed_alphabet = alphabet[::-1]
    translation = str.maketrans(alphabet + alphabet.upper(),
                                reversed_alphabet + reversed_alphabet.upper())
    return text.translate(translation)

message = input("Enter the encoded message: ")
cipher = decode(message)
print(cipher)
