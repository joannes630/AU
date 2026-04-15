import pytest
from p6 import find_largest_score  # replace with your file name

def test_find_largest_score_normal():
    scores = {
        "Alice": 85,
        "Bob": 92,
        "Charlie": 78
    }
    assert find_largest_score(scores) == 92


def test_find_largest_score_all_positive():
    scores = {
        "A": 10,
        "B": 20,
        "C": 5
    }
    assert find_largest_score(scores) == 20


def test_find_largest_score_empty():
    scores = {}
    assert find_largest_score(scores) == 0
