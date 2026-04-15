import pytest
from p7 import compute_average_score  # replace with your file name

def test_compute_average_score_normal():
    scores = {
        "Alice": 80,
        "Bob": 90,
        "Charlie": 100
    }
    assert compute_average_score(scores) == 90


def test_compute_average_score_single():
    scores = {
        "Alice": 75
    }
    assert compute_average_score(scores) == 75


def test_compute_average_score_empty():
    scores = {}
    assert compute_average_score(scores) is None


def test_compute_average_score_with_floats():
    scores = {
        "A": 85.5,
        "B": 90.5
    }
    assert compute_average_score(scores) == 88.0
