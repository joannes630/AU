Describe "Path Script Tests" {

    It "displays Directory exists for a valid directory" {
        Mock Read-Host { "C:\Temp" }
        Mock Test-Path {
            param($path, $PathType)
            if ($PathType -eq "Container") { return $true }
            return $false
        }

        $output = & "$PSScriptRoot\directory check.ps1"
        $output | Should -Be "Directory exists"
    }

    It "displays File exists for a valid file" {
        Mock Read-Host { "C:\Temp\file.txt" }
        Mock Test-Path {
            param($path, $PathType)
            if ($PathType -eq "Leaf") { return $true }
            return $false
        }

        $output = & "$PSScriptRoot\directory check.ps1"
        $output | Should -Be "File exists"
    }

    It "displays Not found for invalid path" {
        Mock Read-Host { "C:\Invalid" }
        Mock Test-Path { return $false }

        $output = & "$PSScriptRoot\directory check.ps1"
        $output | Should -Be "Not found"
    }
}
