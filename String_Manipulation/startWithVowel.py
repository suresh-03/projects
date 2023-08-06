list = ["suresh","arun","eva","israel","owen","uma","kavin","kumar"]

def countVowel(list):
    count = 0
    for word in list:
        if(word[0] == "a" or word[0] == 'e' or word[0] == 'i' or 
           word[0] == 'o' or word[0] == 'u'):
            count+=1
    return count

print(countVowel(list))