import pytest
from p4 import delete_from_phonebook  # replace with your file name

def test_delete_existing():
    phonebook = {
        "Alice": "111-1111",
        "Bob": "222-2222"
    }

    result = delete_from_phonebook(phonebook, "Alice")

    assert result is True
    assert "Alice" not in phonebook
    assert len(phonebook) == 1


def test_delete_not_existing():
    phonebook = {
        "Alice": "111-1111",
        "Bob": "222-2222"
    }

    result = delete_from_phonebook(phonebook, "Charlie")

    assert result is False
    assert len(phonebook) == 2
