package java_basics;

class method{
    //return method without parameter
   public String show(){
       return "suresh";
   }
    //method with parameter
    public int add(int a, int b){
        return a + b;
    }
}

public class returnMethod {

    
    public static void main(String[] args) {
        method o = new method();
        System.out.println(o.show());
        System.out.println(o.add(5, 6)); 
        String b = name();
        int d = multiply(6, 8);
      
        System.out.println(b);
        System.out.println(d);
    }

    //return static method without parameters

    public static String name(){
        return "kumar";
    }

    //static method with parameters

    public static int multiply(int a, int b){
        return a * b;
    }
}
