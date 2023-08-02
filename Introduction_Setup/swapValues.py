n1 = int(input("Enter number a:"))
n2 = int(input("Enter number b:"))

print(f"Before swap a={n1} and b={n2}")
n1 = n1 + n2
n2 = n1 - n2
n1 = n1 - n2
print("After swap a={} and b={}".format(n1,n2))