Describe "Username Script Tests" {
    It "displays Welcome Admin for admin user" {
        Mock Read-Host { "admin" }
        $output = & "$PSScriptRoot\check username.ps1"
        $output | Should -Be "Welcome Admin"
    }

    It "displays Welcome Student for student user" {
        Mock Read-Host { "student" }
        $output = & "$PSScriptRoot\check username.ps1"
        $output | Should -Be "Welcome Student"
    }

    It "displays Access Denied for other users" {
        Mock Read-Host { "guest" }
        $output = & "$PSScriptRoot\check username.ps1"
        $output | Should -Be "Access Denied"
    }
}
