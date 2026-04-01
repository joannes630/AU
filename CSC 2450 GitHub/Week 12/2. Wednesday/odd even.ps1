<#
**Problem Statement — Even or Odd Checker**

Write a PowerShell script that prompts the user to enter a number. The script
should convert the input to an integer and determine whether the number is even
or odd. 

If the number is divisible by 2, display `"Even"`; 
otherwise, display `"Odd"`. 

Use an `if-else` statement to implement the logic.

Write-Output "Odd"
} else {
if ($num % 2 -eq 0) {
$num = [int](Read-Host "Enter a number")
}
Write-Output "Even"
#>



