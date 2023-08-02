string = input("Enter the string:")

def reverse(string):
    for i in range(0,len(string)):
        print(string[(len(string)-1)-i],end="")

reverse(string)