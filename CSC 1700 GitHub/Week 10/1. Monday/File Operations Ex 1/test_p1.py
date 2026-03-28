import subprocess
import sys
from pathlib import Path
import re

def run_program(input_data):
    project_root = Path(__file__).resolve().parent
    program_path = project_root / "p1.py"

    file = project_root / "data.txt"
    file.write_text("Hello CSC 1700!\nSecond line")

    result = subprocess.run(
        [sys.executable, str(program_path)],
        input=input_data,
        text=True,
        capture_output=True,
        cwd=project_root
    )
    return result.stdout.strip()

def test_case_1():
    assert run_program("") == "Hello CSC 1700!"