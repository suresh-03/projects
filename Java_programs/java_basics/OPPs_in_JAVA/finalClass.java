package java_basics.OPPs_in_JAVA;

// final class - these classes can not be inherited by sub classes

final class finalClassDemo{
    void display(){
        System.out.println("i am a final class");
    }
}

// class demo extends finalDemo{  // it is not possible because final classes can not be inherited

// }


public class finalClass {
    public static void main(String[] args) {
        finalClassDemo o = new finalClassDemo();
        o.display();        
    }
}
