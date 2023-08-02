numbers = (input("Enter numbers:"))
lists = list(map(int,numbers.split(" ")))

max = lists[0]
min = lists[0]

for num in lists:
    if(num > max):
        max = num
    if(num < min):
        min = num

print("MAX :",max)
print("MIN :",min)