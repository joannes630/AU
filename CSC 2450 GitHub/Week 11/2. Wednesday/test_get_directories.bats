#!/usr/bin/env bats

setup() {
    # Create temporary directories for testing
    TMP_SRC="$(mktemp -d)"
    TMP_DEST="$(mktemp -d)"
    rm -rf "$TMP_DEST"   # remove so we can test creation
}

teardown() {
    rm -rf "$TMP_SRC"
    rm -rf "$TMP_DEST"
}

@test "accepts valid source directory and creates destination" {
    run bash -c "source ./get_directories.sh; printf '%s\n%s\n' '$TMP_SRC' '$TMP_DEST' | get_directories"

    [ "$status" -eq 0 ]
    [ -d "$TMP_DEST" ]
}

@test "rejects invalid source directory and asks again" {
    INVALID="/invalid/path/doesnotexist"

    run bash -c "source ./get_directories.sh; printf '%s\n%s\n%s\n' '$INVALID' '$TMP_SRC' '$TMP_DEST' | get_directories"

    [ "$status" -eq 0 ]
    [[ "$output" == *"Invalid source directory"* ]]
    [ -d "$TMP_DEST" ]
}

@test "does not recreate destination if it exists" {
    EXISTING_DEST="$(mktemp -d)"

    run bash -c "source ./get_directories.sh; printf '%s\n%s\n' '$TMP_SRC' '$EXISTING_DEST' | get_directories"

    [ "$status" -eq 0 ]
    [ -d "$EXISTING_DEST" ]
}
