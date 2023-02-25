package java_basics.OPPs_in_JAVA;

// interface - it is like abstract class
// interface should only contains abstract methods
// we can implement the interface by using classes
// interface only supports static and final variables and methods.
// by default methods in interface are public and abstract
// by default variables in interface are final and static
// we can use private and default methods in interface

interface house{
   public abstract void bedroom(); // here the public abstract is not necessary
   // because it is already public and abstract by default
    void kitchen();
    void hall();

    // in interface the static method should only have body of method
    public static void toilet(){
        System.out.println("it is toilet");
    }

    // this private method also can have body in interface
    // this private method can be accessed by the default method.
    private void locker(){
        System.out.println("locker is closed");
    }

    // default method also can have body in the interface
    default void tv(){
        System.out.println("tv is on");
        locker(); // private method accessed through this default method
    }
}

// interface can be extended like classes using "extends" keyword
interface house2 extends house{
    String size = "2 acres"; // by default this variable is final and static
    // it can be initialized as {final static String size = "2 acres";}
}

class hou2 implements house2{

    @Override
    public void bedroom() {
        // TODO Auto-generated method stub
        System.out.println("it is bathroom for house2");
    }

    @Override
    public void kitchen() {
        // TODO Auto-generated method stub
        System.out.println("it is kitchen for house2");
    }

    @Override
    public void hall() {
        // TODO Auto-generated method stub
        System.out.println("it is hall for house2");
    }
    
}

class bathroom implements house{
    public void bedroom(){
        System.out.println("it is bedroom");
    }
    public void kitchen(){
        System.out.println("it is kitchen");
    }
    public void hall(){
        System.out.println("it is hall");
    }

    void bath(){
        System.out.println("it is bathroom");
    }

}



public class InterfaceDemo {
    public static void main(String[] args) {
        hou2 h = new hou2();
        h.bedroom();
        h.hall();
        h.kitchen();
        bathroom b = new bathroom();
        b.bedroom();
        b.bath();
        b.hall();
        b.kitchen();
        b.tv();
        house.toilet(); // it is static method in house interface
        System.out.println(house2.size); // this size in interface house2 is also static and final
        
    }
}
