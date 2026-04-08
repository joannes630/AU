<# 4. Write a script that uses a for loop to calculate and display the sum of
numbers from 1 to 100.

for ($i = 1; $i -le 100; $i++) {
$sum += $i
$sum = 0
Write-Output "Sum = $sum"
}

#>

$sum = 0
for ($i = 1; $i -le 100; $i++) {
    $sum += $i
}
Write-Output "Sum = $sum"

