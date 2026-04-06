<#
Write a PowerShell script that defines a function named GreetUser which accepts
a name as a parameter and displays a greeting message.

The function should output:
    Hello, <name>!
    Prompt the user to enter their name
    Call the function and pass the user’s input as an argument

GreetUser "$name"
Write-Output "Hello, $name!"
function GreetUser($name) {
$name = Read-Host "Enter your name"
}

#>
function GreetUser($name) {
    Write-Output "Hello, $name!"
}

$name = Read-Host "Enter your name"
GreetUser "$name"

