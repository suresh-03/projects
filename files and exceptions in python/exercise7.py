def order(size, *toppings):
    c = []
    a = f"{size} inch pizza is made with:"
    for topping in toppings:
        c.append(topping)
    return a + str(c)


order(30,"mushrom")
