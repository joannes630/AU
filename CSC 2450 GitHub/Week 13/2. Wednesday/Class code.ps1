For Loop Examples

Basic example:
for ($i = 1; $i -le 5; $i++) {
    Write-Output "Iteration $i"
}

Counting Down
for ($i = 5; $i -ge 1; $i--) {
    Write-Output $i
}

Using Different Step Sizes
for ($i = 0; $i -le 10; $i += 2) {
    Write-Output $i
}

Basic Example (Array)
$names = @("Alice", "Bob", "Charlie")
foreach ($name in $names) {
    Write-Output "Hello, $name"
}

Example with Numbers
$numbers = 1, 2, 3, 4, 5
foreach ($n in $numbers) {
    Write-Output $n
}

Using foreach with Files (Very Practical)
foreach ($file in Get-ChildItem) {
    Write-Output $file.Name, $file.Length, $file.LastWriteTime
}

Get-ChildItem returns objects (files/folders)
$file represents each object


