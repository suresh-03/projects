ps1 = int(input("enter the no of peoples watched show 1:"))
avg_rs1 = float(input("enter the avg rating for show 1:"))

ps2 = int(input("\nenter the no of peoples watched show 2:"))
avg_rs2 = float(input("enter the avg rating for show 2:"))

ps3 = int(input("\nenter the no of peoples watched show 3:"))
avg_rs3 = float(input("enter the avg rating for show 3:"))

ps = ps1 + ps2 + ps3
rs1 = ps1 * avg_rs1
rs2 = ps2 * avg_rs2
rs3 = ps3 * avg_rs3

rs = rs1 + rs2 + rs3
avg_rating = rs / ps

print("average rating for all shows is:", avg_rating)
