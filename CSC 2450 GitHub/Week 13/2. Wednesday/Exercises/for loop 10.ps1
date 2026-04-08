<#
10. Write a script that uses a foreach loop to calculate the average of
numbers stored in an array.

$total += $num
$total = 0
foreach ($num in $numbers) {
}
$numbers = @(10, 20, 30, 40, 50)
Write-Output "Average = $average"
$average = $total / $numbers.Count

#>
$numbers = @(10, 20, 30, 40, 50)
$total = 0
foreach ($num in $numbers) {
    $total += $num
}
$average = $total / $numbers.Count
Write-Output "Average = $average"

