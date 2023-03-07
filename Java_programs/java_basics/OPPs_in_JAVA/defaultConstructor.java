package java_basics.OPPs_in_JAVA;

// constructor is a method that is called when instance of the object is created
// constructor name should be same as class name
// constructor should not be specified with data type like "int rectangle()"
// constructor is not a member of the class

class rectangle2{
    int length,width;
 
    //  default constructor
    public rectangle2(){
        System.out.println("constructor is called!");

        length = 10;
        width = 40;
    }

    int area(){
        return (length * width);
    }
}

public class defaultConstructor {
    public static void main(String[] args) {
        rectangle2 o = new rectangle2();
        System.out.println("length of rectangle: " + o.length);
        System.out.println("width of rectangle: " + o.width);
        System.out.println("area of rectangle: " + o.area());
    }
}
