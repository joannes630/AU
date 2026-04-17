import pytest
from p2 import vowel_count   # rename file if needed


def test_no_vowels():
    assert vowel_count("bcdfg") == 0


def test_all_vowels():
    assert vowel_count("aeiou") == 5


def test_mixed_case():
    assert vowel_count("HeLLo") == 2


def test_with_spaces():
    assert vowel_count("hello world") == 3


def test_with_numbers_symbols():
    assert vowel_count("abc123!@#") == 1


def test_empty_string():
    assert vowel_count("") == 0
