package java_basics.OPPs_in_JAVA;


// anonymous inner class - class without name { this class is created while creation of object }

abstract class in{
    String b = "in";
    abstract void inside_display();
}

class outside{
    String a = "out";
    void outsideDisplay(){
        System.out.println("displaying outer class");
        in i = new in() {
            public void inside_display(){
                System.out.println("displaying in class");
            }
        };

        System.out.println(i.b);
        i.inside_display();
    }
 

    
   
}

public class anonymous_InnerClass {
    public static void main(String[] args) {
        outside o = new outside();
        System.out.println(o.a);
        o.outsideDisplay();   
    }
}
