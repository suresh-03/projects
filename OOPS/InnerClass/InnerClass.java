package OOPS.InnerClass;

public class InnerClass {
    static class in{  // inner classes or only be a static class then only its 
        // accessible
        void message(){
            System.out.println("hello i am in");
        }
    }
    public static void main(String[] args) {
      in o = new in();
      o.message();
    }
}
