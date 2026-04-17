import pytest


def test_long_string(monkeypatch, capsys):
    # Mock user input
    monkeypatch.setattr('builtins.input', lambda _: "abcdefghij")  # length = 10

    # Import and run the script
    import p1

    # Capture output
    captured = capsys.readouterr()
    assert "Long string" in captured.out


def test_short_string(monkeypatch, capsys):
    monkeypatch.setattr('builtins.input', lambda _: "abc")  # length < 10

    import importlib
    import p1
    importlib.reload(p1)

    captured = capsys.readouterr()
    assert "Short string" in captured.out


def test_exact_boundary(monkeypatch, capsys):
    monkeypatch.setattr('builtins.input', lambda _: "1234567890")  # exactly 10

    import importlib
    import p1
    importlib.reload(p1)

    captured = capsys.readouterr()
    assert "Long string" in captured.out
