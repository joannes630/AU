import p3

def test_list2d_average_basic():
    data = [[1, 2, 3], [4, 5]]
    assert p3.list2d_average(data) == 15


def test_list2d_average_empty():
    data = []
    assert p3.list2d_average(data) == 0

