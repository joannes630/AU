<#
Write a PowerShell script that repeatedly prompts the user to enter a number
between 0 and 100.
    If the number is within the valid range (0–100), display:
        <number> is between 0 and 100
    and terminate the program.

    If the number is outside the valid range, display:
        <number> is invalid, try again
    and prompt the user again.
The program should continue until a valid number is entered.

Write-Output "$x is between 0 and 100"
while ($true) {
break
}
}
else {
$x = [int] (Read-Host "Enter a number (0-100)")
Write-Output "$x is invalid, try again"
if ($x -ge 0 -and $x -le 100) {
}
#>

while ($true) {
    $x = [int] (Read-Host "Enter a number (0-100)")
    if ($x -ge 0 -and $x -le 100) {
        Write-Output "$x is between 0 and 100"
        break
    }
    else {
        Write-Output "$x is invalid, try again"
    }
}
