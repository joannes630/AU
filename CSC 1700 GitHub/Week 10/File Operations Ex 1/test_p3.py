from pathlib import Path
from p3 import read_file

def test_case_1(tmp_path, capsys):
    project_root = Path(__file__).resolve().parent
    program_path = project_root / "p3.py"

    # create temporary file
    file = project_root / "data.txt"
    file.write_text("Hello CSC 1700!\nSecond line")

    # run the function
    read_file(file)

    # capture printed output
    captured = capsys.readouterr()
    assert captured.out.strip() == "Hello CSC 1700!\nSecond line"