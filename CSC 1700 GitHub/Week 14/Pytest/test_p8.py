import pytest
from p8 import find_name_by_phone  # replace with your file name

def test_find_name_by_phone_found():
    phonebook = {
        "Alice": "111-1111",
        "Bob": "222-2222"
    }
    assert find_name_by_phone(phonebook, "222-2222") == "Bob"


def test_find_name_by_phone_not_found():
    phonebook = {
        "Alice": "111-1111",
        "Bob": "222-2222"
    }
    assert find_name_by_phone(phonebook, "999-9999") is None


def test_find_name_by_phone_empty():
    phonebook = {}
    assert find_name_by_phone(phonebook, "111-1111") is None
