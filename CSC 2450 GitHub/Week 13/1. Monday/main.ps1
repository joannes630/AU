function Test {
    $script:x = 5
    Write-Host "$x"
}

$x = 10
Test
Write-Host "$x"

