number = input("Enter numbers:")

numbers = list(map(int,number.split(" ")))

sum = 0

for num in numbers:
    sum += num

print(sum)