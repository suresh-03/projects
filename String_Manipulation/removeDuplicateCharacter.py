string = "sureshkumar"

def removeDuplicate(string):
    for i in range(0,len(string)-1):
        for j in range(i+1,len(string)):
            if(string[i] == string[j]):
                string = string.replace(string[j],'',1)
    return string


print(removeDuplicate(string))
