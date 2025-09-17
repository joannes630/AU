import random

class Card:
    """Represents a single card with a value between 1 and 11 (Ace can be 1 or 11)."""
    def __init__(self):
        self.value = random.randint(1, 11)

    def __repr__(self):
        return str(self.value)

class Hand:
    """Represents a hand of cards for a player or dealer."""
    def __init__(self):
        self.cards = [Card(), Card()]

    def add_card(self):
        self.cards.append(Card())

    def calculate_score(self):
        score = sum(card.value for card in self.cards)
        # Adjust for an Ace if the score is over 21
        if 11 in [card.value for card in self.cards] and score > 21:
            for card in self.cards:
                if card.value == 11:
                    card.value = 1
                    score = sum(card.value for card in self.cards)
                    break
        return score

    def __repr__(self):
        return f"Hand: {self.cards} (Score: {self.calculate_score()})"

class Player:
    """Represents a player in the Blackjack game."""
    def __init__(self, name="Player"):
        self.name = name
        self.hand = Hand()

    def hit(self):
        self.hand.add_card()

    def get_score(self):
        return self.hand.calculate_score()

class Dealer(Player):
    """Represents the dealer, inheriting from Player with different rules."""
    def __init__(self):
        super().__init__(name="Dealer")

    def play(self):
        while self.get_score() < 17:
            self.hit()

class BlackjackGame:
    """Main game class to control the flow of a Blackjack game."""
    def __init__(self):
        self.player = Player()
        self.dealer = Dealer()

    def play(self):
        print("Welcome to Blackjack!\n")
        print(f"Your initial hand: {self.player.hand}")
        print(f"Dealer's initial card: {self.dealer.hand.cards[0]}")

        # Player's turn
        while True:
            if self.player.get_score() == 21:
                print("You got a Blackjack! You win!")
                return
            elif self.player.get_score() > 21:
                print("You went over 21! You lose.")
                return

            action = input("Type 'hit' to draw another card, or 'stand' to hold your hand: ").lower()
            if action == 'hit':
                self.player.hit()
                print(f"Your hand: {self.player.hand}")
            elif action == 'stand':
                break

        # Dealer's turn
        self.dealer.play()
        print(f"Dealer's final hand: {self.dealer.hand}")

        # Determine the winner
        player_score = self.player.get_score()
        dealer_score = self.dealer.get_score()

        if dealer_score > 21 or player_score > dealer_score:
            print("You win!")
        elif player_score == dealer_score:
            print("It's a draw!")
        else:
            print("You lose.")

# Run the game
game = BlackjackGame()
game.play()
