package java_basics.OPPs_in_JAVA;

// local inner class - class inside the method

class out{
    String x = "out";
    void outDisplay(){
        System.out.println("displaying outer class");
    }

    void inDisplay(){
        // this in class only can used inside this method
        class in{
            String y = "in";
            void insideDisplay(){
                System.out.println("displaying inner class");
            }
        }
        in i = new in();
        i.insideDisplay();
        System.out.println(i.y);
    }
}

public class local_InnerClass {
    public static void main(String[] args) {
        out o = new out();
        System.out.println(o.x);
        o.outDisplay();
        o.inDisplay();
    }
}
