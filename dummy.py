class count:
    def __init__(self):
        self.num1 = 0
        self.num2 = 0

    def inc1(self,c):
        self.c = c
        self.num1 += self.c
    
    def inc2(self,d):
        self.d = d
        self.num2 += self.d

user = count()
while True:
    a = int(input("enter your num:"))
    user.inc1(a)
    if user.num1 == 10:
        print("you winner!")
        break
    b = int(input("enter your num1:"))
    user.inc2(b)
    if user.num2 == 10:
        print("you winner!")
        break
    
print(user.num1)
print(user.num2)

        
