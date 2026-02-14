import subprocess
import sys
from pathlib import Path
import re

def run_program(input_data):
    project_root = Path(__file__).resolve().parent
    program_path = project_root / "p1.py"

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
    inputs = ["3"]
    input_data = "\n".join(inputs) + "\n"
    assert run_program(input_data) == "6"

def test_case_2():
    inputs = ["5"]
    input_data = "\n".join(inputs) + "\n"
    assert run_program(input_data) == "15"


# import subprocess
# import sys
# from pathlib import Path
#
# def run_program(input_data):
#     project_root = Path(__file__).resolve().parent
#     program_path = project_root / "p1.py"
#
#     result = subprocess.run(
#         [sys.executable, str(program_path)],
#         input=input_data,
#         text=True,
#         capture_output=True
#     )
#     return result.stdout.strip()


# import subprocess
# import sys
#
# def run_program(input_data):
#     result = subprocess.run(
#         [sys.executable, "p1.py"],
#         input=input_data,
#         text=True,
#         capture_output=True
#     )
#     return result.stdout.strip()
#
# def test_p1_5():
#     assert run_program("5\n") == "15"
#
# def test_p1_1():
#     assert run_program("1\n") == "1"
#
# def test_p1_0():
#     assert run_program("0\n") == "0"
#
# def test_p1_10():
#     assert run_program("10\n") == "55"
