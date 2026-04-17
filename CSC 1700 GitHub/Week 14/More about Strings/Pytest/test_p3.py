import pytest
from p3 import convert_case


def test_all_lowercase():
    assert convert_case("hello") == "HELLO"


def test_all_uppercase():
    assert convert_case("WORLD") == "world"


def test_mixed_case():
    assert convert_case("HeLLo") == "hEllO"


def test_with_numbers():
    assert convert_case("abc123") == "ABC123"


def test_with_symbols():
    assert convert_case("Hello!") == "hELLO!"


def test_with_spaces():
    assert convert_case("Hello World") == "hELLO wORLD"


def test_empty_string():
    assert convert_case("") == ""


def test_only_non_letters():
    assert convert_case("1234!@#$") == "1234!@#$"


def test_long_string():
    assert convert_case("Python3.8 Is FUN!") == "pYTHON3.8 iS fun!"
