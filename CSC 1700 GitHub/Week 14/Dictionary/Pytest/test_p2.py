import pytest
from p2 import find_phonenumber  # replace with your file name

def test_find_phonenumber_found():
    phonebook = {
        "Alice": "111-1111",
        "Bob": "222-2222"
    }
    assert find_phonenumber(phonebook, "Alice") == "111-1111"

def test_find_phonenumber_not_found():
    phonebook = {
        "Alice": "111-1111",
        "Bob": "222-2222"
    }
    assert find_phonenumber(phonebook, "Charlie") is None
