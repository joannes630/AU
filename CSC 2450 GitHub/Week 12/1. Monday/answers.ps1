# greetins.ps1
$name = Read-Host "Enter your name"
Write-Output "Hello, $name!"

# if-else 1.ps1
$name = Read-Host "Enter name"
if ($name -like "J*") {
    Write-Output "Match"
} else {
    Write-Output "Does not match"
}

# if-else 2.ps1
$x = 9
if ($x -ge 10) {
    Write-Output "Greater than or equal to 10"
} else {
    Write-Output "Less than 10"
}

# if-else 3.ps1
$x = [int] (Read-Host "Enter a number")
if ($x -ge 10) {
    Write-Output "Greater than or equal to 10"
} else {
    Write-Output "Less than 10"
}

# if-else 4.ps1
$x = [int] (Read-Host "Enter a number")
if ($x -gt 10) {
    Write-Output "Greater than 10"
} elseif ($x -eq 10) {
    Write-Output "Equal to 10"
} else {
    Write-Output "Less than 10"
}
