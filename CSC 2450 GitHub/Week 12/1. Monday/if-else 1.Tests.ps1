Describe "Name Match Script" {

    It "outputs Match when name starts with J" {

        # Mock input
        Mock Read-Host { "John" }

        # Run script
        $output = & {
            . "$PSScriptRoot\if-else 1.ps1"
        }

        # Verify
        $output | Should -Be "Match"
    }

    It "outputs Does not match when name does not start with J" {

        # Mock input
        Mock Read-Host { "Alice" }

        # Run script
        $output = & {
            . "$PSScriptRoot\if-else 1.ps1"
        }

        # Verify
        $output | Should -Be "Does not match"
    }
}
