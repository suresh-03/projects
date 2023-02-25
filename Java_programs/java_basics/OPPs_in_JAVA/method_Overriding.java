package java_basics.OPPs_in_JAVA;

// method overriding..

class details{
    int id;
    String name;
    details(int x, String y){
        this.id = x;
        this.name = y;
    }

    void display(){
        System.out.println("id of customer: " + id);
        System.out.println("name of customer: " + name);
    }
}

class detail extends details{
    String address;
    detail(int a, String b,String c){
        super(a, b);
        this.address = c;
    }

    void display(){
        System.out.println("id of customer: " + id);
        System.out.println("name of customer: " + name);
        System.out.println("address of customer: " + address);
    }
}

public class method_Overriding {
    public static void main(String[] args) {
        detail o = new detail(3, "sureshkumar", "microsoft");
        o.display();
    }
}
