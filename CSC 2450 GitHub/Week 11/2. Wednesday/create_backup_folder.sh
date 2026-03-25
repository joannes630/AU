: << 'COMMENT'
Write a Bash function create_backup_folder which generates a timestamp
(YYYYMMDD_HHMMSS), builds a directory name backup_TIMESTAMP inside the existing
DEST directory, and creates it using mkdir -p. Assume DEST is already defined
and valid.

Cut/Paste from the code below to create the script.

BACKUP_DIR="$DEST/backup_$TIMESTAMP"
TIMESTAMP=$(date +"%Y%m%d_%H%M%S")
create_backup_folder() {
mkdir -p "$BACKUP_DIR"
}

COMMENT
