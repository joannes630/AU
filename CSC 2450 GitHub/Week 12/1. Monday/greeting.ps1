<#
Write a script that asks the user to enter their name. After the user provides
their input, display a greeting message in the format:
Hello, <name>!
The program should store the user’s input in a variable and correctly include 
it in the output message.


name = Read-Host "Enter your name"
Write-Output "Hello, name!"
Write-Output "Hello, $name!"
$name = Get-Host "Enter your name"
$name = Read-Host "Enter your name"
$name == Read-Host "Enter your name"
$name = Reading-Host "Enter your name"

#>

