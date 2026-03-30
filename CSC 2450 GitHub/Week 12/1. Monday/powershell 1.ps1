To show powershell version: 
$PSVersionTable.PSVersion

To update to version 7 (you might need to run this as admin):
winget upgrade Microsoft.PowerShell
winget install Microsoft.PowerShell

To install Pester:
Install-Module -Name Pester -Force -Scope CurrentUser

To invoke Pester:
Invoke-Pester .\greeting.Tests.ps1

To check if you are running as administrator:
([Security.Principal.WindowsPrincipal][Security.Principal.WindowsIdentity]::GetCurrent()).IsInRole([Security.Principal.WindowsBuiltInRole]::Administrator)

Command completion, right arrow key

pwd     -> Get-Location
ls      -> Get-ChildItem
ls -a   -> Get-ChildItem -Force

attrib +/-[r/a/h] file.txt    /S - apply recursively

rm, rmdir   -> Remove-Item    -Recurse for directories

cd      -> Set-Location
cd -    -> Works the same as Linux
Push-Location   -> store current location in the stack
Pop-Location    -> pop the location in the stack

touch   -> New-Item file.txt
mkdir   -> New-Item -ItemType Directory dir
clear   -> Clear-Host

mv      -> Move-Item 
cp      -> Copy-Item

Comment lines also starts with #
Block comment syntax is <#      #>

========================================================================
# Ask the user for their name
$name = Read-Host "Enter your name"

# Display a greeting
Write-Output "Hello, $name!"
pause

if (Test-Path $file) {
    Write-Output "File exists"
} else {
    Write-Output "File not found


Example 2 — Loop (count from 1 to 5)
for ($i = 1; $i -le 5; $i++) {
    Write-Output "Number: $i"
}

Example 3 — Simple file check
$file = "test.txt"

type    -> Get-Command

type "env" in Windows start button to change ENV
Easiest way to apply the changes is to start a new powershell
$env:PATH
Get-ChildItem Env:

