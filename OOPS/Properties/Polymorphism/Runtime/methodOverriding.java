package OOPS.Properties.Polymorphism.Runtime;

public class methodOverriding {
    public static void main(String[] args) {
        actors2 o = new actors2();
        actors.print();
        o.print("suresh");
        actors o1 = new actors2();
        o1.print("suresh");
        actors o2 = new actors();
        o2.print("sureshs");
    }
}
