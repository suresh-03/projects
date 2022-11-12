details = {}

active = True

while active:
    name = input("what is your name:")
    like = input("where do you like to go:")
    details[name] = like
    print()

    repeat = input("if want to continue type 'yes' else 'no':")
    print()
    if repeat == "no":
        active = False
        print()
for key, value in details.items():
    print(key, "likes to go", value)
