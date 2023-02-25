package java_basics.OPPs_in_JAVA;

// constructor with parameter and constructor overloading 
//constructor overloading is having more than one constructor with different types.

class box{
    int length,width;

    // constructor overloading
    public box(){ // default constructor
        length = 5;
        width = 6;
    }

    // constructor with parameter
    box(int x, int y){ 
        length = x;
        width = y;
    }

    public box(int x){
        length = x;
        width = 2;
    }

    int area(){
        return (length * width);
    }
}


public class parameterConstructor {
    public static void main(String[] args) {
        box b1 = new box();
        System.out.println("length of box1: " + b1.length);
        System.out.println("width of box1: " + b1.width);
        System.out.println("area of box1: " + b1.area());

        System.out.println();

        box b2 = new box(4,6);
        System.out.println("length of box2: " + b2.length);
        System.out.println("width of box2: " + b2.width);
        System.out.println("area of box2: " + b2.area());

        System.out.println();

        box b3 = new box(9);
        System.out.println("length of box3: " + b3.length);
        System.out.println("width of box3: " + b3.width);
        System.out.println("area of box3: " + b3.area());

    }
}
