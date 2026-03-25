import subprocess
import sys
from pathlib import Path
import re
import os

project_root = Path(__file__).resolve().parent
def run_program(input_data):
    program_path = project_root / "p2.py"

    result = subprocess.run(
        [sys.executable, str(program_path)],
        input=input_data,
        text=True,
        capture_output=True,
        cwd=project_root
    )

    # Extract all integers printed
    numbers = re.findall(r"-?\d+", result.stdout)
    if numbers:
        return numbers

    # Extract all string
    # match1 = re.findall(r"File not found", result.stdout, re.IGNORECASE)
    # match2 = re.findall(r"All done", result.stdout, re.IGNORECASE)
    # return result.stdout

def test_case_1():
    assert run_program("") == ['249']
