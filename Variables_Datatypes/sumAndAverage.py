number = input("Enter numbers:")
numbers = list(map(int,number.split(" ")))

print("sum = %d"%(sum(numbers)))
print("average = %d"%(sum(numbers)/len(numbers)))
