def divide(a, b):
    # simple safety: avoid ZeroDivisionError
    if b == 0:
        return None
    return a / b

z = divide(8, 2)
print(z)     # 4.0
z = divide(5, 0)
print(z)     # None (we used None to indicate an error)