import subprocess
import sys
from pathlib import Path
import re

project_root = Path(__file__).resolve().parent

def run_program(input_data):
    program_path = project_root / "p3.py"

    result = subprocess.run(
        [sys.executable, str(program_path)],
        input=input_data,
        text=True,
        capture_output=True,
        cwd=project_root
    )

    numbers_match = re.findall(r"-?\d\.\d+", result.stdout)
    string_match = re.findall(r"Cannot divide by zero", result.stdout, re.IGNORECASE)
    if string_match:
        return string_match[-1]
    elif numbers_match:
        return numbers_match[-1]

def test_case_1():
    assert run_program("0") == "Cannot divide by zero"

def test_case_2():
    assert run_program("3") == "3.33"