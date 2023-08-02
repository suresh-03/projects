number = int(input("Enter the number:"))

def checkPrime(number,root=int(number/2)):
    if root == 1:
        return True
    if number % root == 0:
        return False
   
    return checkPrime(number,root-1)

if checkPrime(number):
    print("Prime")
else:
    print("not Prime")