string = input("Enter the string:")

count = 0

index = []

for i in range(0,123):
    index.append(0)

for i in string:
    index[ord(i)]+=1

check = True

for i in range(97,123):
    if index[i] != 1:
        check = False
        break

if check:
    print("pangram")
else:
    print("not pangram")