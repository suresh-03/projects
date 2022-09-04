# two sum problem using list in python.


# creating the list
list_numbers = [3, 4, 5, 6, 7]
# it will give the length of the list
len_list = len(list_numbers)

init = 0
index = 1
# value2 would be list_numbers[0] if init increases the 0 is replaced with increased numbers
value2 = list_numbers[init]
out = int(input("enter the output:"))
while True:
    value1 = list_numbers[index]
    if list_numbers[init] == list_numbers[index]:
        num = list_numbers[-1]
    else:
        num = value2 + value1
    if num == out:
        print(value2, "+", value1, "=", out)
        break
    else:
        index += 1
        if index == (len_list):
            index = 0
            init = init + 1
            if init == len_list:
                print("no two numbers added to get", out)
                break
            else:
                value2 = list_numbers[init]
