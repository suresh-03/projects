package OOPS.SingleTon_Class;

public class test {
    public static void main(String[] args) {
        Singleton o = Singleton.getInstatnce(); // its not accessible because Singleton 
        // constructor is private
        // hence no object can be created
        Singleton p = Singleton.getInstatnce(); 
        o.number = 10;
        p.number = 20; // it will change the number value of o
        // because it also pointing to same number
         
        System.out.println(o.number);
    }
}
