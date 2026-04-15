import pytest
from p5 import display_phonebook  # replace with your file name

def test_display_phonebook_output(capsys):
    phonebook = {
        "Alice": "111-1111",
        "Bob": "222-2222"
    }

    display_phonebook(phonebook)

    captured = capsys.readouterr()

    assert "Alice 111-1111" in captured.out
    assert "Bob 222-2222" in captured.out


def test_display_phonebook_empty(capsys):
    phonebook = {}

    display_phonebook(phonebook)

    captured = capsys.readouterr()

    # Since your function does not print anything for empty dict,
    # we expect no output
    assert captured.out == ""
