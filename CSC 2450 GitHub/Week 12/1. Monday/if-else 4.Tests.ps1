Describe "Number Comparison Script" {

    It "returns 'Greater than or equal to 10' when input is more than 10" {

        # Mock user input
        Mock Read-Host { "12" }

        # Run script and capture output
        $output = . "$PSScriptRoot\if-else 3.ps1"

        # Verify output
        ($output -join "`n") -like "*Greater*" | Should Be $true
    }

    It "returns 'Greater than or equal to 10' when input is 10" {

        # Mock user input
        Mock Read-Host { "10" }

        # Run script and capture output
        $output = . "$PSScriptRoot\if-else 3.ps1"

        # Verify output
        ($output -join "`n") -like "*Equal*" | Should Be $true
    }

    It "returns 'Less than 10' when input is less than 10" {

        # Mock user input
        Mock Read-Host { "5" }

        # Run script and capture output
        $output = . "$PSScriptRoot\if-else 3.ps1"

        # Verify output
        ($output -join "`n") -like "*Less*" | Should Be $true
    }
}

