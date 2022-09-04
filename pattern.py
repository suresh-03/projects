n = int(input("enter the number:"))
Range = (2*n)-1

for row in range(1,Range+1):
  col_in_row = row
  if row > n:
    col_in_row = (2*n) - row
  spac_in_row = n - col_in_row
  for spac in range(spac_in_row):
    print(" ",end="")
  for col in range(col_in_row):
    print("* ",end="")
  print()