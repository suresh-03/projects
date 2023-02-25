package java_basics.OPPs_in_JAVA;

// single inheritance - single class uses all properties of other single class

class father{ // main class
    void house(){
        System.out.println("father owns 2BHK house");
    }
}

class son extends father{ // sub class uses main class properties using "extends" keyword
    void car(){
        System.out.println("son owns audi car");
    }
}


public class singleInheritance {
    public static void main(String[] args) {
        // sub class accessing both main and its own properties
        son o = new son();
        o.house();
        o.car();
    }
}
