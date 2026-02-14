import subprocess
import sys
from pathlib import Path
import re

def run_program(input_data):
    project_root = Path(__file__).resolve().parent
    program_path = project_root / "p8.py"

    result = subprocess.run(
        [sys.executable, str(program_path)],
        input=input_data,
        text=True,
        capture_output=True
    )

    # Extract the strings printed
    match1 = re.findall(r"Incorrect password", result.stdout, re.IGNORECASE)
    match2 = re.findall(r"Access denied", result.stdout, re.IGNORECASE)
    match3 = re.findall(r"Access granted", result.stdout, re.IGNORECASE)
    # return result.stdout.strip()

    # Return the strings printed
    return (
        match1[-1] if match1 else None,
        match2[-1] if match2 else None,
        match3[-1] if match3 else None
    )

def test_case_1():
    inputs = ["hello", "csc1700Rocks!"]
    input_data = "\n".join(inputs) + "\n"
    assert run_program(input_data) == ("Incorrect password", None, "Access granted")

def test_case_2():
    inputs = ["abc", "test!", "pass"]
    input_data = "\n".join(inputs) + "\n"
    assert run_program(input_data) == ("Incorrect password", "Access denied", None)
