import subprocess
import sys
from pathlib import Path
import re

def run_program(input_data):
    project_root = Path(__file__).resolve().parent
    program_path = project_root / "p2.py"

    result = subprocess.run(
        [sys.executable, str(program_path)],
        input=input_data,
        text=True,
        capture_output=True
    )

    # Extract all integers printed
    numbers = re.findall(r"-?\d+", result.stdout)

    # Return the last integer printed (the total)
    return numbers[-1]

def test_case_1():
    inputs = ["3", "10", "20", "30"]
    input_data = "\n".join(inputs) + "\n"
    assert run_program(input_data) == "60"

def test_case_2():
    inputs = ["5", "10", "20", "30", "40", "50"]
    input_data = "\n".join(inputs) + "\n"
    assert run_program(input_data) == "150"
