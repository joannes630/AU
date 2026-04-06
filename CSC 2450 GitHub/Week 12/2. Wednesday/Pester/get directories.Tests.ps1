Describe "Get-Directories Function Tests" {

    It "creates destination directory if it does not exist" {

        Mock Read-Host {
            param($prompt)
            if ($prompt -like "*source*") { "C:\Source" }
            else { "C:\NewDest" }
        }

        Mock Test-Path {
            param($path, $PathType)
            if ($path -eq "C:\NewDest") { return $false }
            return $true
        }

        Mock New-Item { return $null }

        . "$PSScriptRoot\get directories.ps1"

        $output = & { Get-Directories }

        $output | Should -Match "Destination does not exist"
    }
}
