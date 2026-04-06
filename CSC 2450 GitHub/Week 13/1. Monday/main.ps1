function Test {
    $script:x = 20
    Write-Output "$x"
}

$x = 10
Test
Write-Output "$x"

