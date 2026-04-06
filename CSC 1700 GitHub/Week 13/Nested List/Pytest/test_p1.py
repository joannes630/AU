import pytest
from p1 import compute_total 

def test_empty_list():
    assert compute_total([]) == 0

def test_single_row():
    assert compute_total([[5, 10, 15]]) == 30

def test_multiple_rows():
    assert compute_total([[1, 2], [3, 4], [5, 6]]) == 21

def test_all_zeros():
    assert compute_total([[0, 0], [0, 0]]) == 0

def test_mixed_positive_and_negative():
    assert compute_total([[10, -5], [-2, 8]]) == 11

def test_large_values():
    assert compute_total([[1000, 2000], [3000, 4000]]) == 10000
