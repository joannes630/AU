import p4

def test_list2d_average_basic():
    data = [[1, 2, 3], [4, 5]]
    assert p4.list2d_average(data) == 3.0


def test_list2d_average_single_row():
    data = [[10, 20, 30]]
    assert p4.list2d_average(data) == 20.0


def test_list2d_average_empty_inner_lists():
    data = [[], [], [2, 4]]
    assert p4.list2d_average(data) == 3.0


def test_list2d_average_empty():
    data = []
    assert p4.list2d_average(data) is None

