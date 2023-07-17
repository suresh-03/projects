package java_basics.OPPs_in_JAVA;

// final method - this method can not be override

class Super{
    void display(){
        System.out.println("i am a super display");
    }
    final void show(){
        System.out.println("i am a final super display");
    }
}

class sub extends Super{
    void display(){ // method overriding
        System.out.println("i am a sub display");
    }
    // void show(){} is not possible because show() is a final method
    // but final void show() can be used by derived classes
}

public class finalMethods {
    public static void main(String[] args) {
        sub o = new sub();
        o.display();
        o.show();
    }
}
