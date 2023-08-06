word = "what is your name and how was thar enormous beautifully trip"


def findMax(word):
    max = 0
    count = 0
    for i in word:
        if i == " ":
            if(count-1 > max):
                max = count-1
            count = 0
        count+=1
    return max

print(findMax(word))