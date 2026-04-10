# ==========================================
# PowerShell Script — Backup Manager
# ==========================================

$LOG_FILE = "backup_log.txt"
$REPORT_FILE = "report.txt"

# ==========================================
# 1. User Input & Validation
# ==========================================
function Get-Directories {
    while ($true) {
        $script:SRC = Read-Host "Enter source directory"
        if (Test-Path $SRC -PathType Container) {
            break
        } else {
            Write-Output "Invalid source directory. Try again."
        }
    }

    $script:DEST = Read-Host "Enter destination directory"

    if (-not (Test-Path $DEST -PathType Container)) {
        Write-Output "Destination does not exist. Creating..."
        New-Item -ItemType Directory -Path $DEST | Out-Null
    }
}

# ==========================================
# 2. Timestamped Backup
# ==========================================
function Create-BackupFolder {
    $TIMESTAMP = Get-Date -Format "yyyyMMdd_HHmmss"
    $script:BACKUP_DIR = Join-Path $DEST "backup_$TIMESTAMP"
    New-Item -ItemType Directory -Path $BACKUP_DIR | Out-Null
}

# ==========================================
# 3. File Filtering (.txt, .log, .sh)
# ==========================================
function Copy-Files {
    $FILE_COUNT = 0
    $files = Get-ChildItem -Path $SRC -Recurse -File |
        Where-Object { $_.Extension -in ".txt", ".log", ".sh" }

    $COPY_SOURCE = (Get-Item $SRC)

    foreach ($file in $files) {
        $relativePath = $file.FullName.Substring($COPY_SOURCE.FullName.Length)
        $targetPath = Join-Path $BACKUP_DIR $relativePath
        $targetDir = Split-Path $targetPath

        if (-not (Test-Path $targetDir)) {
            New-Item -ItemType Directory -Path $targetDir -Force | Out-Null
        }

        Copy-Item $file.FullName -Destination $targetPath -ErrorAction SilentlyContinue
        $FILE_COUNT++
    }
}

# ==========================================
# 4. Compression
# ==========================================
function Compress-Backup {
    $zipPath = "$BACKUP_DIR.zip"
    Compress-Archive -Path $BACKUP_DIR -DestinationPath $zipPath -Force
}

# ==========================================
# 5. Logging System
# ==========================================
function Log-Backup {
    $size = (Get-ChildItem $BACKUP_DIR -Recurse | Measure-Object -Property Length -Sum).Sum
    $sizeKB = "{0:N2} KB" -f ($size / 1MB)

    Set-Content $LOG_FILE "-----------------------------"
    Add-Content $LOG_FILE "Date: $(Get-Date)"
    Add-Content $LOG_FILE "Backup Folder: $BACKUP_DIR"
    Add-Content $LOG_FILE "Files Copied: $FILE_COUNT"
    Add-Content $LOG_FILE "Total Size: $sizeKB"
}

# ==========================================
# 6. Report Generation
# ==========================================
function Generate-Report {
    $files = Get-ChildItem $BACKUP_DIR -Recurse -File

    $TOTAL_FILES = $files.Count

    $LARGEST_FILE = $files | Sort-Object Length -Desc ending | Select-Object -First 1

    $TXT_COUNT = ($files | Where-Object { $_.Extension -eq ".txt" }).Count
    $LOG_COUNT = ($files | Where-Object { $_.Extension -eq ".log" }).Count
    $SH_COUNT = ($files | Where-Object { $_.Extension -eq ".sh" }).Count

    Set-Content $REPORT_FILE "=========== REPORT ==========="
    Add-Content $REPORT_FILE "Date: $(Get-Date)"
    Add-Content $REPORT_FILE "Total Files: $TOTAL_FILES"
    Add-Content $REPORT_FILE "Largest File: $($LARGEST_FILE.Name)"
    Add-Content $REPORT_FILE ".txt files: $TXT_COUNT"
    Add-Content $REPORT_FILE ".log files: $LOG_COUNT"
    Add-Content $REPORT_FILE ".sh files: $SH_COUNT"
    Add-Content $REPORT_FILE "=============================="
}

# ==========================================
# Run Full Backup Process
# ==========================================
function Run-Backup {
    Get-Directories
    Create-BackupFolder
    Copy-Files
    Compress-Backup
    Log-Backup
    Generate-Report

    Write-Output "Backup completed successfully."
}

# ==========================================
# Menu System
# ==========================================
while ($true) {
    Write-Output ""
    Write-Output "===== Backup Manager ====="
    Write-Output "1. Run Backup"
    Write-Output "2. View Logs"
    Write-Output "3. View Reports"
    Write-Output "4. Exit"
    Write-Output "=========================="

    $choice = Read-Host "Choose an option"

    switch ($choice) {
        "1" { Run-Backup }
        "2" { Get-Content $LOG_FILE }
        "3" { Get-Content $REPORT_FILE }
        "4" { Write-Output "Exiting..."; exit }
        default { Write-Output "Invalid option. Try again." }
    }
}
