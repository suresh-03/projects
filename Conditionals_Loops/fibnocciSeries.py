num = int(input("Enter the number:"))

def fib(num):
    if num < 2:
        return 1
    return fib(num-1)+fib(num-2)

for i in range(num):
    print(fib(i))