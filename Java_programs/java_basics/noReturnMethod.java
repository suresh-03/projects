package java_basics;


//method in class
class method{
    //no return type without parameters
    public void name(){
        System.out.println("suresh kumar");
    }
    //with parameter
    public void add(int a,int b){
        System.out.println(a + b);
    }
}


public class noReturnMethod {
    public static void main(String[] args) {
       show(); // direct method calling because it is static
       method o = new method(); //create object for non static method
       o.name();
       o.add(5, 5);
       sub(4,2);
    }

    

    //method without class (static method)

    public static void show(){
        System.out.println("hello!");
    }

    //method having parameters

    public static void sub(int a, int b){
        System.out.println(a - b);
    }

}
