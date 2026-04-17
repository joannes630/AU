import pytest
from p1 import create_dictionary  # replace with actual file name

def test_create_dictionary(monkeypatch):
    inputs = iter([
        "Alice", "111-1111",
        "Bob", "222-2222",
        "Charlie", "333-3333"
    ])

    monkeypatch.setattr("builtins.input", lambda _: next(inputs))

    result = create_dictionary()

    expected = {
        "Alice": "111-1111",
        "Bob": "222-2222",
        "Charlie": "333-3333"
    }

    assert result == expected
