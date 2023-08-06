word = "how is your day suresh"

def reverseSentence(word):
    list1 = list(word.split(" "))
    list1.reverse()
    return " ".join(list1)

print(reverseSentence(word))