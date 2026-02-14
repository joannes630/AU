import subprocess
import sys
from pathlib import Path
import re

def run_program(input_data):
    project_root = Path(__file__).resolve().parent
    program_path = project_root / "p5.py"

    result = subprocess.run(
        [sys.executable, str(program_path)],
        input=input_data,
        text=True,
        capture_output=True
    )

    # Extract the floats printed
    numbers = re.findall(r"-?\d+\.\d+", result.stdout)

    # Return the last four floats printed
    return numbers[-4], numbers[-3], numbers[-2], numbers[-1]

def test_case_1():
    inputs = ["10", "15.5", "4.5", "-1"]
    input_data = "\n".join(inputs) + "\n"
    assert run_program(input_data) == ("30.00", "2.40", "6.00", "38.40")
