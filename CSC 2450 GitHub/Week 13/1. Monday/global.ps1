function A {
    $script:x = 10
    Write-Output "function A: Set value x to $x"
}

function B {
    Write-Output "function B: The value of x is $x"
}

A
B
Write-Output "Global: The value of x is $x"   # still 10
