package java_basics.OPPs_in_JAVA;

class square{ //class
    int side;// properties 

    void getDetails(int x){ // method
        side = x;
    }

    int area(){
        return (4 * side);
    }
}


public class classesAndObjects {
    public static void main(String[] args) {
        square o1 = new square(); //object creation
        o1.side = 45;
        System.out.println(o1.area());
        o1.getDetails(10);
        System.out.println(o1.area());
    }
}
