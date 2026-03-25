: << 'COMMENT'
Write a Bash function copy_files which finds all .txt, .log, and .sh files in
the SRC directory, copies them to BACKUP_DIR while preserving directory
structure, counts the number of files processed, and suppresses error messages.
Assume SRC and BACKUP_DIR are already defined.

Cut/Paste from the code below to create the script.

FILE_LIST=$(find "$SRC" -type f \( -name "*.txt" -o -name "*.log" -o -name "*.sh" \))
copy_files() {
FILE_COUNT=0
done
}
((FILE_COUNT++))
for file in $FILE_LIST; do
cp --parents "$file" "$BACKUP_DIR" 2>/dev/null

------------------------
COMMENT

