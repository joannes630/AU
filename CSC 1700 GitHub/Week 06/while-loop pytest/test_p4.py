import subprocess
import sys
from pathlib import Path
import re

def run_program(input_data):
    project_root = Path(__file__).resolve().parent
    program_path = project_root / "p4.py"

    result = subprocess.run(
        [sys.executable, str(program_path)],
        input=input_data,
        text=True,
        capture_output=True
    )

    # Extract total printed
    total = re.findall(r"-?\d+", result.stdout)

    # Extract average printed
    average = re.findall(r"-?\d+\.\d+", result.stdout)

    # Return the last integer printed (the total)
    return total[-3], average[-1]

def test_case_1():
    inputs = ["85", "90", "78", "88", "92", "80", "-1"]
    input_data = "\n".join(inputs) + "\n"
    assert run_program(input_data) == ("513", "85.50")
