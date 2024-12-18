

# This program gets a series of test scores and
# calculates the average of the scores with the
# lowest score dropped.
def main():
    # Get the test scores from the user.
    scores = [87, 90, 67, 85, 92]
    # Get the total of the test scores.
    total = get_total(scores)

    # Get the lowest test score.
    lowest = get_min(scores)

    # Subtract the lowest score from the total.
    total = ???

    # Calculate the average. Note that we divide
    # by 1 less than the number of scores because
    # the lowest score was dropped.
    average = ???

    # Display the average.
    # If the program is correct, it should display the average as 88.5
    print('The average, with the lowest score dropped is:', average)


    
