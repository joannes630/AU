: << 'COMMENT'
Write a Bash function named get_directories, that prompts the user to enter a
valid source directory and a destination directory, performing validation and
creating the destination if needed. 

Cut/Paste from the code below to create the script.

read -p "Enter destination directory: " DEST
echo "Destination does not exist. Creating..."
fi
get_directories() {
mkdir -p "$DEST"
echo "Invalid source directory. Try again."
if [ -d "$SRC" ]; then
break
while true; do
read -p "Enter source directory: " SRC
else
fi
done
if [ ! -d "$DEST" ]; then
}
-------------------
COMMENT

