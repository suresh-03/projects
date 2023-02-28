package OOPS.Properties.Polymorphism.CompileTime;

public class methodOverloading {

    public static void main(String[] args) {
        addition o = new addition();
        o.print(9, 10);
        addition.print();
        addition.print(addition.num);
        addition a = new addition(10,20);
        System.out.println(a.a + a.b);
        
    }
}
