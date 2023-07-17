package java_basics.OPPs_in_JAVA;

// multilevel inheritance - class 2 derived from class 1 and class 3 derived from class 2 etc..

class grandFather{ // class 1
    void land(){
        System.out.println("grandfather owns 2 acres land");
    }
}

// multilevel inheritance
class Father extends grandFather{  // class 2
    void house(){
        System.out.println("father buids 3BHK house in that land");
    }
}

class Son extends Father{ // class 3
    void nothing(){
        System.out.println("son sells the house which father had built");
    }
}

public class multilevel_Inheritance {
    public static void main(String[] args) {
        Son o = new Son();
        o.land();
        o.house();
        o.nothing();

        System.out.println();

        Father f = new Father();
        f.land();
        f.house();
    }
}
