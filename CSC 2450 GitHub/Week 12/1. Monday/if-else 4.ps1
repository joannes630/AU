<#
Write a script that prompts the user to enter a number. After the user provides 
the input, determine whether the number is greater than 10, equal to 10, 
or less than 10.

If the number is greater than 10, display
    Greater than 10
Otherwise, if it is equal to 10, display
    Equal to 10
Otherwise,
    Less than 10

Write-Output "Greater than 10"
$x = [int] (Read-Host "Enter a number")
if ($x -gt 10) {
} else {
Write-Output "Equal to 10"
$x = [int] Read-Host "Enter a number"
Write-Output "Less than 10"
}
} elseif ($x -eq 10) {
if (x > 10) {
$x = Read-Host "Enter a number"
} elif ($x -eq 10) {


#>


