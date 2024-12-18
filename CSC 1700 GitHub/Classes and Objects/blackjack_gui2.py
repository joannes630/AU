import random
import tkinter as tk
from tkinter import messagebox

class Card:
    def __init__(self):
        self.value = random.randint(1, 11)

    def __repr__(self):
        return str(self.value)

class Hand:
    def __init__(self):
        self.cards = []

    def add_card(self):
        self.cards.append(Card())

    def calculate_score(self):
        score = sum(card.value for card in self.cards)
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
    def __init__(self, name="Player"):
        self.name = name
        self.hand = None

    def start_new_hand(self):
        self.hand = Hand()
        self.hand.add_card()
        self.hand.add_card()

    def hit(self):
        self.hand.add_card()

    def get_score(self):
        return self.hand.calculate_score() if self.hand else 0

class Dealer(Player):
    def __init__(self):
        super().__init__(name="Dealer")

    def play(self):
        while self.get_score() < 17:
            self.hit()

class BlackjackGameGUI:
    def __init__(self, root):
        self.root = root
        self.root.title("Blackjack Game")

        self.player = Player()
        self.dealer = Dealer()
        self.game_active = False

        self.setup_gui()

    def setup_gui(self):
        self.player_label = tk.Label(self.root, text="Player Hand: N/A", font=("Helvetica", 16))
        self.player_label.pack(pady=5)

        self.dealer_label = tk.Label(self.root, text="Dealer's Hand: N/A", font=("Helvetica", 16))
        self.dealer_label.pack(pady=5)

        self.result_label = tk.Label(self.root, text="", font=("Helvetica", 18, "bold"))
        self.result_label.pack(pady=10)

        button_frame = tk.Frame(self.root)
        button_frame.pack(pady=10)

        self.hit_button = tk.Button(button_frame, text="Hit", command=self.hit, font=("Helvetica", 14))
        self.hit_button.grid(row=0, column=0, padx=10)
        self.hit_button.config(state=tk.DISABLED)

        self.stand_button = tk.Button(button_frame, text="Stand", command=self.stand, font=("Helvetica", 14))
        self.stand_button.grid(row=0, column=1, padx=10)
        self.stand_button.config(state=tk.DISABLED)

        self.play_again_button = tk.Button(button_frame, text="Play", command=self.play_again, font=("Helvetica", 14))
        self.play_again_button.grid(row=0, column=2, padx=10)
        self.play_again_button.config(state=tk.NORMAL)

        self.quit_button = tk.Button(button_frame, text="Quit", command=self.root.quit, font=("Helvetica", 14))
        self.quit_button.grid(row=0, column=3, padx=10)

    def update_gui(self, reveal_dealer=False):
        player_hand_text = "N/A" if not self.player.hand else str(self.player.hand)
        dealer_hand_text = "N/A"
        if self.dealer.hand:
            dealer_hand_text = str(self.dealer.hand) if reveal_dealer else str(self.dealer.hand.cards[0])

        self.player_label.config(text=f"Player Hand: {player_hand_text}")
        self.dealer_label.config(text=f"Dealer's Hand: {dealer_hand_text}")

    def play_again(self):
        self.player.start_new_hand()
        self.dealer.start_new_hand()
        self.result_label.config(text="")
        self.update_gui()
        self.hit_button.config(state=tk.NORMAL)
        self.stand_button.config(state=tk.NORMAL)
        self.game_active = True

    def hit(self):
        if not self.game_active:
            messagebox.showinfo("Game Not Active", "Click 'Play' to start a new game.")
            return

        self.player.hit()
        self.update_gui()
        if self.player.get_score() > 21:
            self.result_label.config(text="You went over 21! Dealer wins.")
            self.end_round()

    def stand(self):
        if not self.game_active:
            messagebox.showinfo("Game Not Active", "Click 'Play' to start a new game.")
            return

        self.hit_button.config(state=tk.DISABLED)
        self.stand_button.config(state=tk.DISABLED)

        self.dealer.play()
        self.update_gui(reveal_dealer=True)

        player_score = self.player.get_score()
        dealer_score = self.dealer.get_score()

        if dealer_score > 21 or player_score > dealer_score:
            self.result_label.config(text="You win!")
        elif player_score == dealer_score:
            self.result_label.config(text="It's a draw!")
        else:
            self.result_label.config(text="Dealer wins.")

        self.end_round()

    def end_round(self):
        self.hit_button.config(state=tk.DISABLED)
        self.stand_button.config(state=tk.DISABLED)
        self.play_again_button.config(state=tk.NORMAL)
        self.game_active = False


root = tk.Tk()
game = BlackjackGameGUI(root)
root.mainloop()
