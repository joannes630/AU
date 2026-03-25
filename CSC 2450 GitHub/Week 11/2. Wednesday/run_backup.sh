: << 'COMMENT'
Write a Bash function named `run_backup` that orchestrates the backup process
by calling a sequence of existing functions in order: 
    - get_directories,
    - create_backup_folder, 
    - copy_files, 
    - compress_backup, 
    - log_backup, and
    - generate_report. 
After executing all steps, the function should display a confirmation message
indicating that the backup completed successfully.

}
compress_backup
run_backup() {
get_directories
log_backup
create_backup_folder
copy_files
echo "Backup completed successfully."
generate_report

COMMENT

