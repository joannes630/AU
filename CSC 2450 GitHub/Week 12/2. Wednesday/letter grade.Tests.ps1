Describe "Grade Script Tests" {

    It "returns A for score >= 90" {
        Mock Read-Host { "95" }

        $output = & "$PSScriptRoot\letter grade.ps1"
        $output | Should -Be "A"
    }

    It "returns B for score between 80-89" {
        Mock Read-Host { "85" }

        $output = & "$PSScriptRoot\letter grade.ps1"
        $output | Should -Be "B"
    }

    It "returns C for score between 70-79" {
        Mock Read-Host { "75" }

        $output = & "$PSScriptRoot\letter grade.ps1"
        $output | Should -Be "C"
    }

    It "returns D for score between 60-69" {
        Mock Read-Host { "65" }

        $output = & "$PSScriptRoot\letter grade.ps1"
        $output | Should -Be "D"
    }

    It "returns F for score below 60" {
        Mock Read-Host { "50" }

        $output = & "$PSScriptRoot\letter grade.ps1"
        $output | Should -Be "F"
    }
}
