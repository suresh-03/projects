package java_basics.OPPs_in_JAVA;

// method overloading - its a compile time polymorphism
// in this method overloading one method can call multiple times with different types

class multiplication{
    // method overloading..
   static int multiply(){
        return 3 * 5;
    }
     static int multiply(int a, int b){
        return a * b;
    }
   static double multiply(double a, double b){
       return a * b;
    }

    static double multiply(double a, int b){
        return a * b;
    }

    static int multiply(int a){
        return a * a;
    }
}

public class method_Overloading {
    public static void main(String[] args) {
        System.out.println(multiplication.multiply());
        System.out.println(multiplication.multiply(4,5));
        System.out.println(multiplication.multiply(4.6,2.5));
        System.out.println(multiplication.multiply(4.8,2));
        System.out.println(multiplication.multiply(5));
    }
}
