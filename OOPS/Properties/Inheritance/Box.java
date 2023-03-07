package OOPS.Properties.Inheritance;

// every class is inherited from Object() class (inbuilt class)

/*final*/ public class Box { // if final is added to this class other classes can't 
// be inherit from this class
    String color;
     int dark;
     
    Box(){
        this.color = "black";
        this.dark = 0;
    }

    void print(){
        System.out.println("hello i am main box");
    }
    public static void main(String[] args) {
        Box b1 = new BoxColor("red", 3);
        System.out.println(b1.color);
        Box b2 = new BoxColor("green", 9);
        System.out.println(b2.color);
        BoxPrice b3 = new BoxPrice(90);
        System.out.println(b3.price);
        System.out.println(BoxPrice.sides);
        Box m = new Box();
        b1.print();
        b3.print();
        m.print();
        

    }
}
