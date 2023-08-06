sentence = "hello how are you how is your family"

def countWords(sentence):
    count = 1
    for i in sentence:
        if i == " ":
            count+=1
    return count

print(countWords(sentence))