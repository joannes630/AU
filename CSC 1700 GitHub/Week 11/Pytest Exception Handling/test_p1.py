import subprocess
import sys
from pathlib import Path
import re
import os

project_root = Path(__file__).resolve().parent
file = project_root / "numbers.txt"

def run_program(input_data):
    program_path = project_root / "p1.py"

    result = subprocess.run(
        [sys.executable, str(program_path)],
        input=input_data,
        text=True,
        capture_output=True,
        cwd=project_root
    )

    # Extract all integers printed
    # numbers = re.findall(r"-?\d+\.\d+", result.stdout)

    # Extract all string
    # match1 = re.findall(r"File not found", result.stdout, re.IGNORECASE)
    # match2 = re.findall(r"All done", result.stdout, re.IGNORECASE)
    return result.stdout

def test_case_1():
    try:
        os.remove(str(file))
    except FileNotFoundError:
        pass
    assert run_program("") == "File not found\n"

def test_case_2():
    file.write_text("6\n5\n10\n9\n11\n12")
    assert run_program("") == "6\n5\n10\n9\n11\n12\n"