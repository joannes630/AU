<#
6. Given an array of numbers, write a script using a foreach loop to count how
many numbers are greater than 50.

$count = 0
foreach ($num in $numbers) {
$count++
if ($num -gt 50) {
}
$numbers = @(10, 55, 23, 78, 90, 45)
}
Write-Output "Count = $count"
#>

$numbers = @(10, 55, 23, 78, 90, 45)
$count = 0
foreach ($num in $numbers) {
    if ($num -gt 50) {
        $count++
    }
}
Write-Output "Count = $count"

