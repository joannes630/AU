#!/bin/bash
# ==========================================================
# Script: cleanup_logs.sh
# Purpose: Safely delete old log files older than N days
# Author: CYB 2810 Student
# Date: October 2025
# ==========================================================

LOG_DIR="/var/log"
DAYS_OLD=7
ARCHIVE="$HOME/log_cleanup_$(date +%F).log"

echo "=== Log Cleanup Report ==="
echo "Date: $(date)"
echo "Target directory: $LOG_DIR"
echo "Files older than $DAYS_OLD days will be deleted"
echo

# Find old files and log them before deletion
find "$LOG_DIR" -type f -name "*.log" -mtime +$DAYS_OLD -print | tee "$ARCHIVE"

echo
read -p "Proceed with deletion? (y/n): " confirm

if [[ $confirm == "y" || $confirm == "Y" ]]; then
    find "$LOG_DIR" -type f -name "*.log" -mtime +$DAYS_OLD -delete
    echo "Old log files deleted successfully."
else
    echo "Deletion canceled."
fi
