: << 'COMMENT'
Write a Bash function named `log_backup` that calculates the total size of a
backup directory stored in `BACKUP_DIR`, extracts the size value, and appends a
formatted log entry to a file specified by `LOG_FILE`. The log entry should
include 
    - a separator line, 
    - the current date, 
    - the backup directory path, 
    - the number of files copied (stored in `FILE_COUNT`), and 
    - the total size of the backup. 
Ensure the output is appended to the log file rather than overwriting it.

SIZE=$(du -sh "$BACKUP_DIR" | cut -f1)
echo "Total Size: $SIZE"
echo "Files Copied: $FILE_COUNT"
{
echo "Date: $(date)"
}
echo "-----------------------------"
log_backup() {
} >> "$LOG_FILE"
echo "Backup Folder: $BACKUP_DIR"
COMMENT


