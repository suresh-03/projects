package OOPS.Properties.Inheritance;

public class BoxPrice extends Box{

    int price;
    static int sides;

    BoxPrice(int price) {
        //super(); // super keyword is used to call the parent class constructor
        //TODO Auto-generated constructor stub
        this.price = price;
        sides = 6;

    }

    BoxPrice(Box box){
        super();
    }

    void print(){
        System.out.println("i am box price");
    }
 
    
}
