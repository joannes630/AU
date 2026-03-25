: << 'COMMENT'
Write a Bash script named `menu.sh` (no functions) that repeatedly displays a
menu with four options: 
    - (1) run a backup by calling `run_backup`, 
    - (2) display the contents of a log file stored in `LOG_FILE`, 
    - (3) display the contents of a report file stored in `REPORT_FILE`, and 
    - (4) exit the program. 

The script should prompt the user to choose an option, execute the
corresponding action using a `case` statement, handle invalid input with an
error message, and continue looping until the user selects exit.

while true; do
read -p "Choose an option: " choice
echo ""
done
echo "===== Backup Manager ====="
echo "4. Exit"
echo "2. View Logs"
3) cat "$REPORT_FILE" ;;
echo "3. View Reports"
echo "=========================="
echo "1. Run Backup"
esac
2) cat "$LOG_FILE" ;;
case $choice in
4) echo "Exiting..."; exit 0 ;;
1) run_backup ;;
*) echo "Invalid option. Try again." ;;

COMMENT

