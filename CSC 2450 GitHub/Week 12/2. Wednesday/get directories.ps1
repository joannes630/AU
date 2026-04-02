<#
Write a Bash function named get_directories, that prompts the user to enter a
valid source directory and a destination directory, performing validation and
creating the destination if needed. 

Cut/Paste from the code below to create the script.

function Get-Directories {
    while ($true) {
        $SRC = Read-Host "Enter source directory"

        if (Test-Path $SRC -PathType Container) {
            break
        } else {
            Write-Output "Invalid source directory. Try again."
        }
    }
    $DEST = Read-Host "Enter destination directory"

    if (-not (Test-Path $DEST -PathType Container)) {
        Write-Output "Destination does not exist. Creating..."
        New-Item -ItemType Directory -Path $DEST | Out-Null
    }
}
#>


