import unittest


def people(name, followers, connections=""):
    p_name = f"name is {name}"
    p_follow = f" -- followers : {followers}"

    if connections:
        p_connection = f" -- connections : {connections}"
        detail = p_name + str(p_follow) + str(p_connection)
    else:
        detail = p_name + str(p_follow)
    return detail


class test(unittest.TestCase):
    def testing1(self):
        func = people("suresh", 90, 100)
        out = "name is suresh -- followers : 90 -- connections : 100"
        self.assertEqual(func, out)

    def testing2(self):
        func = people("sathish", 100)
        out = "name is sathish -- followers : 100"
        self.assertEqual(func, out)


if __name__ == "__main__":
    unittest.main()
