package java_basics.OPPs_in_JAVA;

// constructor overriding..

class addition{
    int a,b;
    addition(int x, int y){
        a = x;
        b = y;
        System.out.println(a + b);
    }
    
}

class add3 extends addition{
    int c;
    add3(int x, int y, int z){
        super(x, y); // super keyword is used for constructor and method overriding
        this.c = z;

        System.out.println(x + y + z);

    }
}

public class constructor_Overriding {
    public static void main(String[] args) {
        new add3(4, 5, 6);
    }
}
