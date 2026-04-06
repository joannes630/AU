import pytest
from p3 import find_max

def test_empty_list():
    assert find_max([]) is None

def test_single_row():
    assert find_max([[1, 5, 3]]) == 5

def test_multiple_rows():
    assert find_max([[1, 2], [8, 4], [3, 6]]) == 8

def test_negative_numbers():
    assert find_max([[-10, -5], [-3, -8]]) == -3

def test_mixed_values():
    assert find_max([[0, -1], [10, 3]]) == 10

def test_single_element():
    assert find_max([[7]]) == 7
