class cricket_teams:
    def __init__(self):
        self.teams = [
            "india",
            "australia",
            "new zealand",
            "south africa",
            "west indies",
            "pakistan",
            "england",
            "srilanka",
        ]

    def describe_teams(self):
        for team in self.teams:
            print("\t", team)


class team_players(cricket_teams):
    def __init__(self, fav_team):
        super().__init__()
        self.fav_team = fav_team

    def players(self):
        if self.fav_team == self.teams[0]:
            print("\nINDIA:")
            print("main batsman: virat")
            print("main bowler: bumrah")
            print("captain: rohit sharma")

        elif self.fav_team == self.teams[1]:
            print("\nAUSTRALIA:")
            print("main batsman: warner")
            print("main bowler: starc")
            print("captain: finch")

        elif self.fav_team == self.teams[2]:
            print("\nNEW ZEALAND:")
            print("main batsman: coway")
            print("main bowler: trent boult")
            print("captain: williamson")

        elif self.fav_team == self.teams[3]:
            print("\nSOUTH AFRICA:")
            print("main batsman: Q de cock")
            print("main bowler: k rabada")
            print("captain: A markram")

        elif self.fav_team == self.teams[4]:
            print("\nWEST INDIES:")
            print("main batsman: S hope")
            print("main bowler: J holder")
            print("captain: K pollard")

        elif self.fav_team == self.teams[5]:
            print("\nPAKISTAN:")
            print("main batsman: babar azam")
            print("main bowler: shain afridi")
            print("captain: babar azam")

        elif self.fav_team == self.teams[6]:
            print("\nENGLAND:")
            print("main batsman: J buttler")
            print("main bowler: J archer")
            print("captain: J buttler")

        elif self.fav_team == self.teams[7]:
            print("\nSRI LANKA:")
            print("main batsman: kusal mendis")
            print("main bowler: W hasaranga")
            print("captain: karunaratne")

        else:
            print("enter the valid team name!")
