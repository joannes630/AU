<#
Write a PowerShell script that repeatedly prompts the user to enter a number.
    If the user enters -1, the program should terminate.
    If the user enters a negative number (less than -1), ignore the input and prompt again.
    If the user enters a positive number, display the message:
        You entered <number>

The program should continue running until the user enters 0.

if ($num -eq -1) {
$num = [int] (Read-Host "Enter a number (-1 to stop)")
break
}
}
if ($num -lt -1) {
while ($true) {
Write-Output "You entered $num"
continue
}
#>

while ($true) {
    $num = [int] (Read-Host "Enter a number (-1 to stop)")
    if ($num -eq -1) {
        break
    }
    if ($num -lt -1) {
        continue
    }
    Write-Output "You entered $num"
}
