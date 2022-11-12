import unittest

class employee:
    def __init__(self,firstname,lastname,annualsalary):
        self.firstname = firstname
        self.lastname = lastname
        self.annualsalary = int(annualsalary)

    def give_raise(self,user_raise = ''):
        self.user_raise = user_raise
        if user_raise:
            self.annualsalary += int(user_raise)
            return f"custom raise: {user_raise}"
        else:
            self.annualsalary += 5000
            return "default raise: 5000"
    
    def show(self):
        print(f"name of employee: {self.firstname.title()}{self.lastname.title()}")
        print(f"annual salary of the employee with raise:",self.annualsalary)
        self.annualsalary -= self.annualsalary
        
user = employee("suresh", "kumar", annualsalary = 10000)
user.give_raise(user_raise = 2000)
user.show()

user = employee("suresh", "kumar", annualsalary = 10000)
user.give_raise(user_raise = '')
user.show()

class test_employee(unittest.TestCase):
    """
    def test_custom_raise(self):
        test = employee("suresh", "kumar", 10000)
        func = test.give_raise(user_raise = '10000')
        out = f"custom raise: 10000"
        self.assertEqual(func, out)
    
    def test_def_raise(self):
        test = employee("suresh", "kumar", 10000)
        func = test.give_raise(user_raise = '')
        out = f"default raise: 5000"
        self.assertEqual(func, out)
    """

    """           '' OR ''             """

    def setUp(self):
        self.test = employee("suresh", "kumar", 10000)
    
    def test_def(self):
        func = self.test.give_raise(user_raise = '')
        out = "default raise: 5000"
        self.assertEqual(func, out)
    
    def test_custom(self):
        func = self.test.give_raise(2000)
        out = "custom raise: 2000"
        self.assertEqual(func, out)


if __name__ == "__main__":
    unittest.main()
