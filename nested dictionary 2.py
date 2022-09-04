julie = {"animal": "cat", "owner": "mani"}
babu = {"animal": "dog", "owner": "guru"}
pets = [julie, babu]

# for pet_info in pets:
#    if pet_info == julie:
#        for key, values in pets[0].items():
#            if key == "animal":
#                print(f"julie is a very good {values.title()}")
#            if key == "owner":
#                print(f"julie's owner is {values.title()}")
# ------------------------------------------------------------------------------

favorite_places = {
    "virat": ["bangalore", "mumbai", "delhi"],
    "dhoni": ["chennai", "ranchi", "kolkata"],
    "rohit": ["mumbai", "chennai", "agra"],
}

# for person,place in favorite_places.items():
#    print(f"{person.title()}'s favorite places are: ")
#    for places in place:
#        print(places)
#    print()

# -----------------------------------------------------------------------------

cities = {
    "bangalore": {
        "country": "india",
        "population": "3 billion",
        "fact": "india's electronic city",
    },
    "new york": {
        "country": "america",
        "population": "2 billion",
        "fact": "i think it is capital of america",
    },
    "london": {
        "country": "united kingdom",
        "population": "1 billion",
        "fact": "beautiful place in UK",
    },
}

# for places,place_details in cities.items():
#    print(places)
#    for detail,value in place_details.items():
#        print(f"{detail.title()} : {value.title()}")
#    print()
# ----------------------------------------------------------------------
