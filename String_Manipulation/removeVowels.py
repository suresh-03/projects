
def removeVowel(*kids):
    for word in kids:
        for i in word:
            if(i == "a" or i == "e" or i == "i" or i == "o" or i == "u"):
                word = word.replace(i,"")
        print(word)
                

removeVowel("main","gopi","ravi")