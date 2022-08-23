# finding repeated and absent numbers in the list using python.


import math

a = [1, 1, 4, 5, 6, 4, 6, 7, 15]
a_copy = []
Not_present_num = []
repeated_num = []

b = len(a) / 2
b = math.ceil(b)

print("middle value index in list:", b)

middle_max = a[b]
middle_min = a[b]

print("middle value in list:", middle_max)

max = 0
min = 0

for i in a:
    if i > middle_max:
        max = i
        middle_max = i

for j in a:
    if j < middle_min:
        min = j
        middle_min = j

print("maximum value in the list:", max)
print("minimum value in the list:", min)

for num in range(min, max):
    if num not in a:
        Not_present_num.append(num)

for num in a:
    if num not in a_copy:
        a_copy.append(num)
    else:
        repeated_num.append(num)

print("not present numbers in the list:", Not_present_num)
print("repeated numbers in the list:", repeated_num)
