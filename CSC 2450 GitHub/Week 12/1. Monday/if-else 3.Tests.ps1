Describe "Number Comparison Script" {

    It "outputs Greater than or equal to 10 when input is 10 or more" {

        # Mock input
        Mock Read-Host { "15" }

        # Run script
        $output = & {
            . "$PSScriptRoot\if-else 3.ps1"
        }

        # Verify
        $output | Should -Be "Greater than or equal to 10"
    }

    It "outputs Less than 10 when input is less than 10" {

        # Mock input
        Mock Read-Host { "5" }

        # Run script
        $output = & {
            . "$PSScriptRoot\if-else 3.ps1"
        }

        # Verify
        $output | Should -Be "Less than 10"
    }

    It "outputs Greater than or equal to 10 when input is exactly 10" {

        # Mock input
        Mock Read-Host { "10" }

        # Run script
        $output = & {
            . "$PSScriptRoot\if-else 3.ps1"
        }

        # Verify
        $output | Should -Be "Greater than or equal to 10"
    }
}
