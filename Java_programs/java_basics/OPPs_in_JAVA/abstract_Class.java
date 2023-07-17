package java_basics.OPPs_in_JAVA;

// abstract class - this class or method don't have definition it is simply declared
// if a class has atleast 1 abstract method then the class should be abstract
// abstract class can have both abstract and non-abstract method
// abstract method can be used by simply defining it
// abstract class can have both final and static variables and non-final and non-static variable


abstract class shape{ // abstract class
    abstract void draw(); // abstract method
    void display(){
        System.out.println("shape is displaying...");
    }
}

class rectangle3 extends shape{
    void draw(){ // body for abstract method draw() to access it.
        System.out.println("rectangle is drawn..");
    }
}

public class abstract_Class {
    public static void main(String[] args) {
        rectangle3 o = new rectangle3();
        o.display();
        o.draw();
    }
}
