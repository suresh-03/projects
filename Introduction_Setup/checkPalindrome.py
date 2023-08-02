string = input("Enter a String:")
lists = []
for c in string:
    lists.append(c)

lists.reverse()

if(list(string) == lists):
    print("true")
else:
    print("false")
