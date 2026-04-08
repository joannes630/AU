<#
8. Write a script that uses a foreach loop to display only the
names of .txt files in a directory.

Write-Output $file.Name
$files = Get-ChildItem
if ($file.Name -like "*.txt") {
}
foreach ($file in $files) {
}

#>

$files = Get-ChildItem
foreach ($file in $files) {
    if ($file.Name -like "*.txt") {
        Write-Output $file.Name
    }
}

