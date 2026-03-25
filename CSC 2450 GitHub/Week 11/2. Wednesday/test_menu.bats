#!/usr/bin/env bats

setup() {
    LOG_FILE="$(mktemp)"
    REPORT_FILE="$(mktemp)"

    echo "Sample Log" > "$LOG_FILE"
    echo "Sample Report" > "$REPORT_FILE"
}

teardown() {
    rm -f "$LOG_FILE"
    rm -f "$REPORT_FILE"
}

@test "option 4 exits the program" {
    run bash -c "
        export LOG_FILE='$LOG_FILE'
        export REPORT_FILE='$REPORT_FILE'
        printf '4\n' | bash ./menu.sh
    "

    [ "$status" -eq 0 ]
    [[ "$output" == *"Exiting..."* ]]
}

@test "invalid option shows error message" {
    run bash -c "
        export LOG_FILE='$LOG_FILE'
        export REPORT_FILE='$REPORT_FILE'
        printf '9\n4\n' | bash ./menu.sh
    "

    [ "$status" -eq 0 ]
    [[ "$output" == *"Invalid option. Try again."* ]]
}

@test "option 2 displays log file" {
    run bash -c "
        export LOG_FILE='$LOG_FILE'
        export REPORT_FILE='$REPORT_FILE'
        printf '2\n4\n' | bash ./menu.sh
    "

    [ "$status" -eq 0 ]
    [[ "$output" == *"Sample Log"* ]]
}

@test "option 3 displays report file" {
    run bash -c "
        export LOG_FILE='$LOG_FILE'
        export REPORT_FILE='$REPORT_FILE'
        printf '3\n4\n' | bash ./menu.sh
    "

    [ "$status" -eq 0 ]
    [[ "$output" == *"Sample Report"* ]]
}

@test "option 1 calls run_backup (mocked)" {
    run bash -c '
        export LOG_FILE="'"$LOG_FILE"'"
        export REPORT_FILE="'"$REPORT_FILE"'"

        # Mock function
        run_backup() { echo "RUN_BACKUP_CALLED"; }

        # Run script in same shell so mock is visible
        printf "1\n4\n" | source ./menu.sh
    '

    [ "$status" -eq 0 ]
    [[ "$output" == *"RUN_BACKUP_CALLED"* ]]
}
