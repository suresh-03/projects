package java_basics.OPPs_in_JAVA;

// static variables and methods - it is common for all objects
// default variables and methods - it can be varies for individual objects

class staticDemo{
    int a = 10;
    static int b = 100;
    void display(){
        System.out.println("a : " + a + " b : " + b); // non-static method can use both static and non-static variables    
    }
    static void display2(){
        System.out.println("b : " + b); // static method only can use static variables
    }
}

public class static_VariablesAndMethods {
    public static void main(String[] args) {
        staticDemo o1 = new staticDemo();
        o1.display();
        staticDemo o2 = new staticDemo();
        staticDemo.display2(); // static method dont need object to call
        o2.a = 80;
        o1.display();
        o2.display();
        staticDemo.b = 1; // static variable dont need object to call
        o1.display();
        o2.display();
    }
}
