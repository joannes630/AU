#!/usr/bin/env bats

setup() {
    # Create a temporary destination directory
    DEST="$(mktemp -d)"
}

teardown() {
    rm -rf "$DEST"
}

@test "creates a backup folder inside DEST" {
    run bash -c "DEST='$DEST'; source ./create_backup_folder.sh; create_backup_folder"

    [ "$status" -eq 0 ]

    # Check that at least one backup folder exists
    result=$(ls -l "$DEST"/backup_* 2>/dev/null)
    [ -n "$result" ]
}

@test "backup folder follows correct naming format" {
    run bash -c "DEST='$DEST'; source ./create_backup_folder.sh; create_backup_folder"

    [ "$status" -eq 0 ]

    folder=$(ls -d "$DEST"/backup_* | head -n 1)
    basename=$(basename "$folder")

    # Check pattern: backup_YYYYMMDD_HHMMSS
    [[ "$basename" =~ ^backup_[0-9]{8}_[0-9]{6}$ ]]
}

@test "creates unique backup folders on multiple runs" {
    run bash -c "DEST='$DEST'; source ./create_backup_folder.sh; create_backup_folder; sleep 1; create_backup_folder"

    [ "$status" -eq 0 ]

    count=$(ls -d "$DEST"/backup_* | wc -l)
    [ "$count" -ge 2 ]
}
