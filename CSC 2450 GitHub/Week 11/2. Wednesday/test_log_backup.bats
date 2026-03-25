#!/usr/bin/env bats

setup() {
    # Create temp directories and log file
    BACKUP_DIR="$(mktemp -d)"
    LOG_FILE="$(mktemp)"

    # Create some files so du has something to measure
    touch "$BACKUP_DIR/file1.txt"
    touch "$BACKUP_DIR/file2.txt"

    FILE_COUNT=2
}

teardown() {
    rm -rf "$BACKUP_DIR"
    rm -f "$LOG_FILE"
}

@test "writes backup log entry to file" {
    run bash -c "BACKUP_DIR='$BACKUP_DIR'; LOG_FILE='$LOG_FILE'; FILE_COUNT=$FILE_COUNT; source ./log_backup.sh; log_backup"

    [ "$status" -eq 0 ]

    # Check log file exists and is not empty
    [ -s "$LOG_FILE" ]
}

@test "log contains expected fields" {
    run bash -c "BACKUP_DIR='$BACKUP_DIR'; LOG_FILE='$LOG_FILE'; FILE_COUNT=$FILE_COUNT; source ./log_backup.sh; log_backup"

    [ "$status" -eq 0 ]

    content="$(cat "$LOG_FILE")"

    [[ "$content" == *"Date:"* ]]
    [[ "$content" == *"Backup Folder: $BACKUP_DIR"* ]]
    [[ "$content" == *"Files Copied: $FILE_COUNT"* ]]
    [[ "$content" == *"Total Size:"* ]]
}

@test "appends multiple log entries" {
    run bash -c "BACKUP_DIR='$BACKUP_DIR'; LOG_FILE='$LOG_FILE'; FILE_COUNT=$FILE_COUNT; source ./log_backup.sh; log_backup; log_backup"

    [ "$status" -eq 0 ]

    count=$(grep -c "Backup Folder:" "$LOG_FILE")

    # Should have at least 2 entries
    [ "$count" -ge 2 ]
}
