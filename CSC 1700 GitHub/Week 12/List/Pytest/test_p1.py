import p1

def test_change_all_evens_basic():
    data = [1, 2, 3, 4]
    p1.change_all_evens(data)
    assert data == [1, 3, 3, 5]


def test_change_all_evens_empty():
    data = []
    p1.change_all_evens(data)
    assert data == []

