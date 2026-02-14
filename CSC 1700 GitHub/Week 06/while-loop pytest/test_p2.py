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
    numbers = re.findall(r"-?\d+\.\d+", result.stdout)

    # Return the last integer printed (the total)
    return numbers[-1]

def test_case_1():
    inputs = ["12.5", "8.99", "5", "0"]
    input_data = "\n".join(inputs) + "\n"
    assert run_program(input_data) == "26.49"