<#
**Problem Statement — File or Directory Check**

Write a PowerShell script that prompts the user to enter a file or directory
path. The script should determine whether the path corresponds to an existing
directory, an existing file, or does not exist at all. 

If the path is a directory, display `"Directory exists"`. 
Else if it is a file, display `"File exists"`. 
Otherwise, display `"Not found"`. 

Use appropriate PowerShell commands and an `if-elseif-else` structure to
implement the logic.

if (Test-Path $path -PathType Container) {
Write-Output "Not found"
} else {
Write-Output "Directory exists"
} elseif (Test-Path $path -PathType Leaf) {
Write-Output "File exists"
$path = Read-Host "Enter a path"
}
#>

$path = Read-Host "Enter a path"
if (Test-Path $path -PathType Container) {
    Write-Output "Directory exists"
} elseif (Test-Path $path -PathType Leaf) {
    Write-Output "File exists"
} else {
    Write-Output "Not found"
}

