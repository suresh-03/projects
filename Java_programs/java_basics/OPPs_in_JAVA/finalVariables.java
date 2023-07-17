package java_basics.OPPs_in_JAVA;

// final variables - this can be initialized using final keyword
// this variables values are can not be changed
// this variables can be initialised with values by two ways
        // by direct way like a = 10
        // by constructors
// this final variables are normally represented in capital letters like { final int A = 10; }

class finalDemo{
    final int MIN = 1; // normal initialization
    final int MAX;
    final int NORMAL;

    finalDemo(int max){ // constructor initialization
        this.MAX = max;
        this.NORMAL = 50;
    }

    void display(){
        System.out.println("min : " + this.MIN);
        System.out.println("normal : " + this.NORMAL);
        System.out.println("max : " + this.MAX);
    }
}

public class finalVariables {
    public static void main(String[] args) {
        finalDemo o = new finalDemo(100);
        o.display();
        // {o.MAX = 300;} is not possible because final variable value cant be changed
    }
}
