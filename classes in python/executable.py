from worldcup import cricket_teams,team_players

print("ICC WORLD CUP 2022:-\n")
print("TEAMS:-")
show = cricket_teams()
show.describe_teams()

while True:
    con = int(input("\nif you want to know more about various teams press '1'\n or want to quit press '0':"))
    if con == 1:
        user_req = input("\nenter your favorite team:")
        user_req = user_req.lower()
        user = team_players(user_req)
        user.players()
    elif con == 0:
        print("thank you!")
        break
    else:
        print("give valid response!")
        break
