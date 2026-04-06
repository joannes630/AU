<#
Write a PowerShell script that uses a loop to display numbers from 1 to 5.
    Start with a counter variable initialized to 1
    Use a loop to print each number on a new line
    Increment the counter after each iteration
    Stop the loop after reaching 5

while ($count -le 5) {
$count = 1
}
$count++
Write-Output $count
#>

$count = 1
while ($count -le 5) {
    Write-Output $count
    $count++
}

