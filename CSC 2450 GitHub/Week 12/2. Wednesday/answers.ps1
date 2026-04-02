# check username

# Ask the user to enter a username
$username = Read-Host "Enter username"

# Check username
if ($username -eq "admin") {
    Write-Output "Welcome Admin"
} elseif ($username -eq "student") {
    Write-Output "Welcome Student"
} else {
    Write-Output "Access Denied"
}


# directory check
# Ask the user to enter a path
$path = Read-Host "Enter a path"

# Check if directory or file
if (Test-Path $path -PathType Container) {
    Write-Output "Directory exists"
} elseif (Test-Path $path -PathType Leaf) {
    Write-Output "File exists"
} else {
    Write-Output "Not found"
}


# letter grade
$score = [int](Read-Host "Enter a score (0-100)")
if ($score -ge 90) {
    Write-Output "A"
} elseif ($score -ge 80) {
    Write-Output "B"
} elseif ($score -ge 70) {
    Write-Output "C"
} elseif ($score -ge 60) {
    Write-Output "D"
} else {
    Write-Output "F"
}

# odd-even
$num = [int](Read-Host "Enter a number")
# Check if divisible by 2
if ($num % 2 -eq 0) {
    Write-Output "Even"
} else {
    Write-Output "Odd"
}

# get directories
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
