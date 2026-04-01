Describe "Number Comparison Script with elseif" {

    It "outputs Greater than 10 when input is greater than 10" {

        Mock Read-Host { "15" }

        $output = & {
            . "$PSScriptRoot\if-else 4.ps1"
        }

        $output | Should -Be "Greater than 10"
    }

    It "outputs Equal to 10 when input is exactly 10" {

        Mock Read-Host { "10" }

        $output = & {
            . "$PSScriptRoot\if-else 4.ps1"
        }

        $output | Should -Be "Equal to 10"
    }

    It "outputs Less than 10 when input is less than 10" {

        Mock Read-Host { "5" }

        $output = & {
            . "$PSScriptRoot\if-else 4.ps1"
        }

        $output | Should -Be "Less than 10"
    }
}
