import pytest
from p4 import reverse_string


def test_normal_string():
    assert reverse_string("hello") == "olleh"


def test_mixed_case():
    assert reverse_string("HeLLo") == "oLLeH"


def test_with_spaces():
    assert reverse_string("hello world") == "dlrow olleh"


def test_with_numbers():
    assert reverse_string("12345") == "54321"


def test_with_symbols():
    assert reverse_string("abc!@#") == "#@!cba"


def test_empty_string():
    assert reverse_string("") == ""


def test_single_character():
    assert reverse_string("A") == "A"


def test_palindrome():
    assert reverse_string("madam") == "madam"
