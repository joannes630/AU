import pytest
from p3 import update_phonebook  # replace with your file name

def test_update_phonebook_existing():
    phonebook = {
        "Alice": "111-1111",
        "Bob": "222-2222"
    }

    result = update_phonebook(phonebook, "Alice", "999-9999")

    assert result is True
    assert phonebook["Alice"] == "999-9999"


def test_update_phonebook_not_existing():
    phonebook = {
        "Alice": "111-1111",
        "Bob": "222-2222"
    }

    result = update_phonebook(phonebook, "Charlie", "333-3333")

    assert result is False
    assert "Charlie" not in phonebook
