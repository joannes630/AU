<#
9. Write a script that uses a for loop to create 5 files named file1.txt
through file5.txt.

}
New-Item -Name "file$i.txt" -ItemType File
for ($i = 1; $i -le 5; $i++) {

#>

for ($i = 1; $i -le 5; $i++) {
    New-Item -Name "file$i.txt" -ItemType File
}

