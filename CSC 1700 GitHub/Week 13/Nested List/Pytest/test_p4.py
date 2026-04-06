import pytest
from p4 import avg_of_rows

def test_empty_list():
    assert avg_of_rows([]) == []

def test_single_row():
    assert avg_of_rows([[10, 20, 30]]) == [20]

def test_multiple_rows():
    assert avg_of_rows([[1, 2], [3, 4]]) == [1.5, 3.5]

def test_all_zeros():
    assert avg_of_rows([[0, 0], [0, 0]]) == [0, 0]

def test_mixed_values():
    assert avg_of_rows([[10, -10], [20, -20]]) == [0, 0]

def test_single_element_rows():
    assert avg_of_rows([[5], [10], [15]]) == [5, 10, 15]
