people1 = {"name": "suresh", "age": "19", "colour": "brown"}
people2 = {"name": "sathish", "age": "18", "colour": "black"}
people3 = {"name": "madhu", "age": "19", "colour": "white"}

peoples = [people1, people2, people3]

for people in peoples:
    print(people)

for people, info in people1.items():
    print(people + " : " + info)

pet_details = {
    "jimmy": ["dog", "ramesh", "5", "male"],
    "tom": ["cat", "karun", "3", "female"],
    "khan": ["monkey", "ram", "7", "male"],
}

pets = [pet_details]

for pet in pets:
    if pet["jimmy"] == "dog":
        print(f"{pet} is a dog")
