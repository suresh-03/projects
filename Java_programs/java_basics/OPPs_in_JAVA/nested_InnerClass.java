package java_basics.OPPs_in_JAVA;

// nested inner class - the class inside the class

class outer{
    int a = 50;
    class inner{ // inner class
        int b = 60;
        void innerDisplay(){
            System.out.println("displaying inner class");
        }
    }
    void outerDisplay(){
        System.out.println("displaying outer class");
        inner i = new inner();
        System.out.println(i.b);
        i.innerDisplay();
    }

    
}

public class nested_InnerClass {
    public static void main(String[] args) {
        outer o = new outer();
        System.out.println(o.a);
        o.outerDisplay();

        // another method to access inner class

        outer.inner i = new outer().new inner();
        System.out.println(i.b);
        i.innerDisplay();

    }
}
