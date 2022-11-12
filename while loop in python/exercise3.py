sandwiches = ["veg sandwich", "chicken sandwich", "egg sandwich"]
finished_sandwich = []

while sandwiches:
    ready = sandwiches.pop()
    print(ready, "is ready to eat!")

    finished_sandwich.append(ready)

print()

for sandwich in finished_sandwich:
    print(sandwich, "is finished!")

while "egg sandwich" in finished_sandwich:
    finished_sandwich.remove("egg sandwich")

print(finished_sandwich)
