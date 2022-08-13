import random


class player1:
    def __init__(self, name):
        self.name = name
        self.dice = [1, 2, 3, 4, 5, 6]
        self.board = 0

    def Name(self):
        print(self.name, "! you are player1.")

    def player1(self, roll):
        self.roll = roll
        if self.roll == 'R':
            self.ch1 = random.choice(self.dice)
            self.board += self.ch1
        else:
            print("enter valid input!")
        if self.board > 20:
            self.board -= self.ch1


class player2:
    def __init__(self, name):
        self.name = name
        self.dice = [1, 2, 3, 4, 5, 6]
        self.board = 0

    def Name(self):
        print(self.name, "! you are player2.")

    def player2(self, roll):
        self.roll = roll
        if self.roll == 'R':
            self.ch2 = random.choice(self.dice)
            self.board += self.ch2
        else:
            print("enter valid input!")
        if self.board > 20:
            self.board -= self.ch2
