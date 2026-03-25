#!/usr/bin/env bats

setup() {
    # Create temp file to track execution order
    CALL_LOG="$(mktemp)"
}

teardown() {
    rm -f "$CALL_LOG"
}

@test "calls all required functions in correct order and prints success message" {
    run bash -c '
        CALL_LOG="'"$CALL_LOG"'"

        # Mock functions (replace real ones)
        get_directories()      { echo "get_directories" >> "$CALL_LOG"; }
        create_backup_folder() { echo "create_backup_folder" >> "$CALL_LOG"; }
        copy_files()           { echo "copy_files" >> "$CALL_LOG"; }
        compress_backup()      { echo "compress_backup" >> "$CALL_LOG"; }
        log_backup()           { echo "log_backup" >> "$CALL_LOG"; }
        generate_report()      { echo "generate_report" >> "$CALL_LOG"; }

        source ./run_backup.sh
        run_backup
    '

    [ "$status" -eq 0 ]

    # Check output message
    [[ "$output" == *"Backup completed successfully."* ]]

    # Verify order of function calls
    expected="get_directories
create_backup_folder
copy_files
compress_backup
log_backup
generate_report"

    actual="$(cat "$CALL_LOG")"

    [ "$actual" = "$expected" ]
}
