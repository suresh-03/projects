age = "\nenter your age:"
age1 = "\nwant to exit enter 'quit':"

active = True

while active:
    a = int(input(age))

    if a >= 1 and a < 3:
        print("the ticket is free!")
        a1 = input(age1)
        if a1 == "quit":
            active = False

    elif a >= 3 and a < 12:
        print("the ticket cost $10")
        a1 = input(age1)
        if a1 == "quit":
            active = False
    else:
        print("the ticket cost is $15")
        a1 = input(age1)
        if a1 == "quit":
            active = False
