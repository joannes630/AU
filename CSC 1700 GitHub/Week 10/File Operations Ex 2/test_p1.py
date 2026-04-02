import subprocess
import sys
from pathlib import Path
import re

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
    numbers = re.findall(r"-?\d+\.\d+", result.stdout)

    # Extract all string
    match1 = re.findall(r"No numbers were entered",
                        result.stdout, re.IGNORECASE)
    if match1:
        # Return string
        return match1[-1]
    elif numbers:
        # Return the last integer printed (the total)
        return numbers[-1]

def test_case_1():
    file.write_text("6\n5\n10\n9\n11\n12")
    assert run_program("") == "8.83"

def test_case_2():
    file.write_text("")
    assert run_program("") == None