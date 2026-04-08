<#
7. Write a script that uses a foreach loop to display all file names in the
current directory using Get-ChildItem. The attribute for the filename is
'Name'.

Write-Output $file.Name
foreach ($file in $files) {
}
$files = Get-ChildItem

#>

$files = Get-ChildItem
foreach ($file in $files) {
    Write-Output $file.Name
}

