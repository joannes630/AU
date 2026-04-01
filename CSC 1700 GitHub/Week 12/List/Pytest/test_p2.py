import builtins
import p2

def test_create_5_element_list(monkeypatch):
    inputs = ["1", "2", "3", "4", "5"]

    def mock_input(prompt):
        return inputs.pop(0)

    monkeypatch.setattr(builtins, "input", mock_input)

    result = p2.create_5_element_list()
    assert result == [1, 2, 3, 4, 5]
