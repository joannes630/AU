import subprocess
import sys
from pathlib import Path
import re
import os

project_root = Path(__file__).resolve().parent
file = project_root / "numbers.txt"

def run_program(input_data):
    program_path = project_root / "p4.py"

    result = subprocess.run(
        [sys.executable, str(program_path)],
        input=input_data,
        text=True,
        capture_output=True,
        cwd=project_root
    )

    string_match1 = re.findall(r"No such file or directory", result.stdout, re.IGNORECASE)
    string_match2 = re.findall(r"division by zero", result.stdout, re.IGNORECASE)
    string_match3 = re.findall(r"invalid literal for int", result.stdout, re.IGNORECASE)
    numbers_match = re.findall(r"-?\d+\.\d+", result.stdout)

    if string_match1:
        return string_match1[-1]
    elif string_match2:
        return string_match2[-1]
    elif string_match3:
        return string_match3[-1]
    elif numbers_match:
        return numbers_match[-1]

def test_case_1():
    try:
        os.remove(str(file))
    except FileNotFoundError:
        pass
    assert run_program("") == "No such file or directory"

def test_case_2():
    file.write_text("")
    assert run_program("") == "division by zero"

def test_case_3():
    file.write_text("a")
    assert run_program("") == "invalid literal for int"

def test_case_4():
    file.write_text("6\n5\n10\n9\n11\n12")
    assert run_program("") == "8.83"
