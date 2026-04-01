<#
**Problem Statement — Letter Grade Calculator**

Write a PowerShell script that prompts the user to enter a numeric score
between 0 and 100. The script should convert the input to an integer and
determine the corresponding letter grade using an `if-elseif-else` structure.

Assign grades as follows: 
    90 and above → `"A"`, 
    80–89 → `"B"`, 
    70–79 → `"C"`,
    60–69 → `"D"`, 
    below 60 → `"F"`
Display the appropriate letter grade based on the user’s input.

Write-Output "B"
if ($score -ge 90) {
Write-Output "F"
Write-Output "A"
}
} elseif ($score -ge 80) {
Write-Output "D"
} elseif ($score -ge 70) {
Write-Output "C"
$score = [int](Read-Host "Enter a score (0-100)")
} elseif ($score -ge 60) {
} else {
#>



