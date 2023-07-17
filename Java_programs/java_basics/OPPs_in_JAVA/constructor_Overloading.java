package java_basics.OPPs_in_JAVA;

// constructor overloading..

class addition{
    int a,b;
    addition(){
        a = 4;
        b = 4;
        System.out.println(a + b);
    }
    addition(int a, int b){
        System.out.println(a + b);
    }
    addition(double a, double b){
        System.out.println(a + b);
    }
    addition(int a){
        System.out.println(a + a);
    }
}

public class constructor_Overloading {
    public static void main(String[] args) {
        new addition(3.4,5.8);
       
        }
    }

