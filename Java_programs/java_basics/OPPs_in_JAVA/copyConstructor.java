package java_basics.OPPs_in_JAVA;

// copy constructor is passing the object as parameter to constructor

class complex {
    int real,img;

    complex(){ // default constructor
        real = 5;
        img = 6;
    }

    complex(int x, int y){ // constructor with parameter
        real = x;
        img = y;
    }

    //copy constructor
    complex(complex o1){
        real = o1.real;
        img = o1.img;
    }

    public String toString(){ // toString() method overriding
        return "(" + real + " + " + img + "i)";
    }
}

public class copyConstructor {
    public static void main(String[] args) {
        complex o1 = new complex();
        System.out.println("object1: " + o1);

        complex o2 = new complex(4,1);
        System.out.println("object2: " + o2);

        complex o3 = new complex(o1);
        System.out.println("object3: " + o3);
    }
}
