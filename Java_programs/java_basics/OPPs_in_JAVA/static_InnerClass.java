package java_basics.OPPs_in_JAVA;

// static inner class - creating class using static keyword
// static class can only access static variables and methods from outside class

class sky{
    static int a = 9; // static variable
    int c = 7;
    static class land{ // static class
        void display(){
            System.out.println(a);
        }
    }
}

public class static_InnerClass {
    public static void main(String[] args) {
        sky.land o = new sky.land(); // for static inner class this syntax for object creation
        o.display();
    }
}
