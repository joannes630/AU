<#3. Write a script that uses a foreach loop to print each item in
the following
list: ("apple", "banana", "cherry")

Write-Output $fruit
}
foreach ($fruit in $fruits) {
#>

$fruits = @("apple", "banana", "cherry")
foreach ($fruit in $fruits) {
    Write-Output $fruit
}

