from exercise7 import order
import unittest

class test(unittest.TestCase):
    def testfunc(self):
        func = order(30,"mushroom","cheese","chilli")
        out = "30 inch pizza is made with:['mushroom', 'cheese', 'chilli']"
        self.assertEqual(func,out)



if __name__ == "__main__":
    unittest.main()
                                        
                                       
                                        