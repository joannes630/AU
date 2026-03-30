# To show Powershell version
$PSVersionTable.PSVersion

# To invoke Pester (bats)
Invoke-Pester 

# Print working directory (pwd)
Get-Location
(Get-Location).path

# Print contents of current directory (ls)
Get-ChildItem
Get-ChildItem | Format-Table

# Print contents of current directory, including hidden files (ls -a)
Get-ChildItem -Force

# To copy a file (cp)
Copy-Item

# To move a file (mv)
Move-Item

# To remove a file or folder (rm)
Remove-Item temp.txt

# To change directory (cd)
Set-Location

# To see the history of commands (history)
Get-History

# To create an empty file (touch)
New-Item

# To clear the screen (clear)
Clear-Host

# To dump a file (cat)
Get-Content

# To change file attribute (chmod)
attrib [+-hr]

# Ask the user for their name
$name = Read-Host "Enter your name"

# Display a greeting
Write-Output "Hello, $name!
#
#
# # Basic syntax of an if-else
if (condition) {
    # code if true
} else {
    # code if false
}

# User input of a string
$name = Read-Host "Enter name"
if ($name -like "Joan*") {
    Write-Output "Match"
} else {
    Write-Output "Does not match"
}

# # Using if-else
$x = 15
if ($x -gt 10) {
    Write-Output "Greater than 10"
} else {
    Write-Output "Equal to 10 or less"
}
#
# User input and convert to a number
$x = [int] (Read-Host "Enter a number")
if ($x -ge 10) {
    Write-Output "Greater than or equal to 10"
} else {
    Write-Output "Less than 10"
}

# # Using multiple conditions
$x = 15
if ($x -gt 10) {
    Write-Output "Greater than 10"
} elseif ($x -eq 10) {
    Write-Output "Equal to 10"
} else {
    Write-Output "Less than 10"
}

# How to 'pause' a script
#$name = Read-Host "Enter your name"
Write-Output "Hello, $name!"
pause

# Check if a file exists
if (Test-Path thumbs.db) {
    Write-Output "Found"
} else {
    Write-Output "Not found"
}
