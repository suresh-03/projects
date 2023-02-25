package java_basics.OPPs_in_JAVA;


// nesting method - using a one method in the another method

class max{
    int n1,n2;

    max(int x, int y){ // constructor with parameters
        this.n1 = x;
        this.n2 = y;
    }

    public int max_num(){ // method with parameters
        if(n1 > n2){
            return n1;
        }
        else{
            return n2;
        }
    }

    void display(){ // no return type method
        int large = max_num(); // nesting of method max_num() to display()
        System.out.println("large number is: " + large);
    }
}

public class nestingMethods {
    public static void main(String[] args) {
        max o = new max(10,45);
        o.display();
    }
}
