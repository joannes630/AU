Describe "String Comparison Script" {

    It "returns 'Match' when input starts with a J" {

        # Mock user input
        Mock Read-Host { "James" }

        # Run script and capture output
        $output = . "$PSScriptRoot\if-else 1.ps1"

        # Verify output
        ($output -join "`n") -like "*Match*" | Should Be $true
    }

    It "returns 'Does not match' when input does not start with a J" {

        # Mock user input
        Mock Read-Host { "Kyle" }

        # Run script and capture output
        $output = . "$PSScriptRoot\if-else 1.ps1"

        # Verify output
        ($output -join "`n") -like "*Does not match*" | Should Be $true
    }

}

