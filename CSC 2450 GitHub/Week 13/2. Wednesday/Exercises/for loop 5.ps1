<#
5. Write a script that uses a foreach loop to display the length
of each word in a list of names.

foreach ($name in $names) {
}
Write-Output "$name has length $($name.Length)"
$names = @("Alice", "Bob", "Christopher")

#>

$names = @("Alice", "Bob", "Christopher")
foreach ($name in $names) {
    Write-Output "$name has length $($name.Length)"
}

