import players

play1 = input("enter player 1 name:")
play2 = input("enter player 2 name:")

user1 = players.player1(play1)
user1.Name()
user2 = players.player2(play2)
user2.Name()

while True:
    p1 = input("enter 'R' to roll:")
    p1 = p1.upper()
    user1.player1(p1)
    print("you rolled", user1.ch1)
    print(user1.name, "in", user1.board)
    print()

    if user1.board == 20:
        print(f'"{user1.name.title()} finished the game!"')
        print(f'"{user1.name.title()} is 1st!"')
        print(f'"{user2.name.title()} is 2nd"')
        break

    p2 = input("enter 'R' to roll:")
    p2 = p2.upper()
    user2.player2(p2)
    print("you rolled", user2.ch2)
    print(user2.name, "in", user2.board)
    print()

    if user2.board == 20:
        print(f'"{user2.name.title()} finished the game!"')
        print(f'"{user2.name.title()} is 1st!"')
        print(f'"{user1.name.title()} is 2nd!"')
        break
