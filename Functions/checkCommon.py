list1 = ["mani","dharun","surya"]
list2 = ["dharun","surya","karthik"]

def findIntersection(list1,list2):
    ans = []
    for i in list1:
        for j in list2:
            if(i == j):
                ans.append(i)
                break

    return ans

print(findIntersection(list1,list2))