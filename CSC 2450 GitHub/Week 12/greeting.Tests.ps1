Describe "Greeting Script" {

    It "displays the correct greeting" {

        # Mock user input
        Mock Read-Host { "John" }

        # Run the script and capture output
        $output = & {
            . "$PSScriptRoot\greeting.ps1"
        }

        # Verify output
        $output | Should -Be "Hello, John!"
    }
}
