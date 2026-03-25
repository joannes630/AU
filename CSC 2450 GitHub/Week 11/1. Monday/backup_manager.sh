#!/bin/bash

# ==========================================
# Bash Script Challenge — Backup Manager
# ==========================================

LOG_FILE="backup_log.txt"
REPORT_FILE="report.txt"

# ==========================================
# 1. User Input & Validation
# ==========================================
get_directories() {
    while true; do
        read -p "Enter source directory: " SRC
        if [ -d "$SRC" ]; then
            break
        else
            echo "Invalid source directory. Try again."
        fi
    done

    read -p "Enter destination directory: " DEST

    if [ ! -d "$DEST" ]; then
        echo "Destination does not exist. Creating..."
        mkdir -p "$DEST"
    fi
}

# ==========================================
# 2. Timestamped Backup
# ==========================================
create_backup_folder() {
    TIMESTAMP=$(date +"%Y%m%d_%H%M%S")
    BACKUP_DIR="$DEST/backup_$TIMESTAMP"
    mkdir -p "$BACKUP_DIR"
}

# ==========================================
# 3. File Filtering (.txt, .log, .sh)
# ==========================================
copy_files() {
    FILE_LIST=$(find "$SRC" -type f \( -name "*.txt" -o -name "*.log" -o -name "*.sh" \))

    FILE_COUNT=0

    for file in $FILE_LIST; do
        cp --parents "$file" "$BACKUP_DIR" 2>/dev/null
        ((FILE_COUNT++))
    done
}

# ==========================================
# 4. Compression
# ==========================================
compress_backup() {
    tar -czf "$BACKUP_DIR.tar.gz" -C "$DEST" "$(basename "$BACKUP_DIR")"
}

# ==========================================
# 5. Logging System
# ==========================================
log_backup() {
    SIZE=$(du -sh "$BACKUP_DIR" | cut -f1)

    {
        echo "-----------------------------"
        echo "Date: $(date)"
        echo "Backup Folder: $BACKUP_DIR"
        echo "Files Copied: $FILE_COUNT"
        echo "Total Size: $SIZE"
    } >> "$LOG_FILE"
}

# ==========================================
# 6. Report Generation
# ==========================================
generate_report() {
    TOTAL_FILES=$(find "$BACKUP_DIR" -type f | wc -l)

    LARGEST_FILE=$(find "$BACKUP_DIR" -type f -exec du -h {} + | sort -hr | head -n 1)

    TXT_COUNT=$(find "$BACKUP_DIR" -name "*.txt" | wc -l)
    LOG_COUNT=$(find "$BACKUP_DIR" -name "*.log" | wc -l)
    SH_COUNT=$(find "$BACKUP_DIR" -name "*.sh" | wc -l)

    DISK_BEFORE=$(df -h "$DEST" | awk 'NR==2 {print $4}')

    # simulate after backup
    DISK_AFTER=$(df -h "$DEST" | awk 'NR==2 {print $4}')

    {
        echo "=========== REPORT ==========="
        echo "Date: $(date)"
        echo "Total Files: $TOTAL_FILES"
        echo "Largest File: $LARGEST_FILE"
        echo ".txt files: $TXT_COUNT"
        echo ".log files: $LOG_COUNT"
        echo ".sh files: $SH_COUNT"
        echo "Disk Space Before: $DISK_BEFORE"
        echo "Disk Space After: $DISK_AFTER"
        echo "=============================="
    } > "$REPORT_FILE"
}

# ==========================================
# Run Full Backup Process
# ==========================================
run_backup() {
    get_directories
    create_backup_folder
    copy_files
    compress_backup
    log_backup
    generate_report

    echo "Backup completed successfully."
}

# ==========================================
# 8. Menu System
# ==========================================
while true; do
    echo ""
    echo "===== Backup Manager ====="
    echo "1. Run Backup"
    echo "2. View Logs"
    echo "3. View Reports"
    echo "4. Exit"
    echo "=========================="

    read -p "Choose an option: " choice

    case $choice in
        1) run_backup ;;
        2) cat "$LOG_FILE" ;;
        3) cat "$REPORT_FILE" ;;
        4) echo "Exiting..."; exit 0 ;;
        *) echo "Invalid option. Try again." ;;
    esac
done
