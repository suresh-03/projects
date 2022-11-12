choice = "enter your toppings which are added to pizza:"
choice += "\nif you want to exit type 'quit':"

message = ""
while message != "quit":
    message = input(choice)
    if message == "quit":
        break
    else:
        print("\n", message, "is added to your pizza!\n")
