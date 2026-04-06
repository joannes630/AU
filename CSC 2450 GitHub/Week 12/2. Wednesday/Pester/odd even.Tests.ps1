Describe "Even/Odd Script Tests" {

    It "returns Even for an even number" {
        Mock Read-Host { "10" }

        $output = & { . "$PSScriptRoot\odd even.ps1" }
        $output | Should -Be "Even"
    }

    It "returns Odd for an odd number" {
        Mock Read-Host { "7" }

        $output = & { . "$PSScriptRoot\odd even.ps1" }
        $output | Should -Be "Odd"
    }
}
