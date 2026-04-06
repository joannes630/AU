<#
Write a Bash function named get_directories, that prompts the user to enter a
valid source directory and a destination directory, performing validation and
creating the destination if needed. 

Cut/Paste from the code below to create the script.

$SRC = Read-Host "Enter source directory"
function Get-Directories {
if (Test-Path $SRC -PathType Container) {
break
Write-Output "Invalid source directory. Try again."
Write-Output "Destination does not exist. Creating..."
}
}
$DEST = Read-Host "Enter destination directory"
}
if (-not (Test-Path $DEST -PathType Container)) {
while ($true) {
} else {
New-Item -ItemType Directory -Path $DEST | Out-Null
}
#>

