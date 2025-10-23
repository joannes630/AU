sum() {
    echo $(($1 + $2))
}

read -p "Enter a number: " x
read -p "Enter another number: " y
result=$(sum "$x" "$y")
echo "Result is $result"
