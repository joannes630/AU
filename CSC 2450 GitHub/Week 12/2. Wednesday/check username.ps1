<#
**Problem Statement — Login Simulation**

Write a PowerShell script that simulates a simple login system. The script
should prompt the user to enter a username. 

Based on the input, display an appropriate message: 
if the username is `"admin"`, display `"Welcome Admin"`; 
else if the username is `"student"`, display `"Welcome Student"`; 
else, display `"Access Denied"`. 

Use an `if-elseif-else` structure to control the program flow.

Write-Output "Access Denied"
} else {
Write-Output "Welcome Admin"
if ($username -eq "admin") {
} elseif ($username -eq "student") {
$username = Read-Host "Enter username"
Write-Output "Welcome Student"
}
#>

$username = Read-Host "Enter username"
if ($username -eq "admin") {
    Write-Output "Welcome Admin"
} elseif ($username -eq "student") {
    Write-Output "Welcome Student"
} else {
    Write-Output "Access Denied"
}


