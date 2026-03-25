#!/usr/bin/env bats

setup() {
    # Create temporary source and backup directories
    SRC="$(mktemp -d)"
    BACKUP_DIR="$(mktemp -d)"

    # Create test files
    mkdir -p "$SRC/subdir"
    touch "$SRC/file1.txt"
    touch "$SRC/file2.log"
    touch "$SRC/file3.sh"
    touch "$SRC/file4.jpg"        # should NOT be copied
    touch "$SRC/subdir/file5.txt" # nested file
}

teardown() {
    rm -rf "$SRC"
    rm -rf "$BACKUP_DIR"
}

@test "copies only .txt, .log, and .sh files" {
    run bash -c "SRC='$SRC'; BACKUP_DIR='$BACKUP_DIR'; source ./copy_files.sh; copy_files"

    [ "$status" -eq 0 ]

    # Expected files exist
    [ -f "$BACKUP_DIR$SRC/file1.txt" ]
    [ -f "$BACKUP_DIR$SRC/file2.log" ]
    [ -f "$BACKUP_DIR$SRC/file3.sh" ]

    # Unexpected file should NOT exist
    [ ! -f "$BACKUP_DIR$SRC/file4.jpg" ]
}

@test "preserves directory structure" {
    run bash -c "SRC='$SRC'; BACKUP_DIR='$BACKUP_DIR'; source ./copy_files.sh; copy_files"

    [ "$status" -eq 0 ]

    # Check nested structure preserved
    [ -f "$BACKUP_DIR$SRC/subdir/file5.txt" ]
}

@test "counts number of files processed" {
    run bash -c "SRC='$SRC'; BACKUP_DIR='$BACKUP_DIR'; source ./copy_files.sh; copy_files; echo \$FILE_COUNT"

    [ "$status" -eq 0 ]

    # Should count only matching files (4 total)
    [ "$output" -eq 4 ]
}
