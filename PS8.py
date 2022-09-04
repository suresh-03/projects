brand = int(input("enter branding expenses:"))
travel = int(input("enter travelling expenses:"))
food = int(input("enter food expenses:"))
logistics = int(input("enter logistics expenses:"))

total_expense = brand + travel + food + logistics

brand_pert = (brand / total_expense) * 100
travel_pert = (travel / total_expense) * 100
food_pert = (food / total_expense) * 100
logis_pert = (logistics / total_expense) * 100

print("\ntotal expenses:", total_expense)

print("\nbrand expense percentage:", brand_pert, "%")
print("travel expense percentage:", travel_pert, "%")
print("food expense percentage:", food_pert, "%")
print("logistics expense percentage:", logis_pert, "%")
