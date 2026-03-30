<#
Write a script that prompts the user to enter a number. After the user provides 
the input, determine whether the number is greater than or equal to 10.

If the number is greater than or equal to 10, display:
    Greater than or equal to 10
Otherwise, display:
    Less than 10

if ($x -ge 10) {
Write-Output "Less than 10"
$x = [int] (Read-Host "Enter a number")
if ($x > 10) {
} else {
}
Write-Output "Greater than or equal to 10"
$x = Read-Host "Enter a number"
if (x -ge 10) {
else

#>
