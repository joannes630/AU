import pytest
from p2 import compute_average

def test_empty_list():
    assert compute_average([]) is None

def test_single_row():
    assert compute_average([[10, 20, 30]]) == 20

def test_multiple_rows():
    assert compute_average([[1, 2], [3, 4]]) == 2.5

def test_all_zeros():
    assert compute_average([[0, 0], [0, 0]]) == 0

def test_mixed_values():
    assert compute_average([[10, -10], [20, -20]]) == 0

def test_single_element():
    assert compute_average([[5]]) == 5
