<#
Write a PowerShell script that defines a function named Add which takes two
numbers as parameters and returns their sum.
    Prompt the user to enter two numbers
    Convert the inputs to integers
    Call the Add function using the user-provided values
    Store the result in a variable

Display the result in the format:
    <x> + <y> = <result>

return $a + $b
}
$result = Add $x $y
$x = [int] (Read-Host "Enter a number")
Write-Host "$x + $y = $result"
function Add($a, $b) {
$y = [int] (Read-Host "Enter another number")
#>

function Add($a, $b) {
    return $a + $b
}

$x = [int] (Read-Host "Enter a number")
$y = [int] (Read-Host "Enter another number")

$result = Add $x $y
Write-Host "$x + $y = $result"
