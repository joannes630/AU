Describe "Greeting Script" {

    It "displays the correct greeting" {

        # Mock user input
        Mock Read-Host { "Joannes" }

        # Run the script and capture output
        $output = . "$PSScriptRoot\greeting.ps1"

        # Verify output contains "Hello"
        ($output -join "`n") -like "*Hello*" | Should Be $true
    }
}
