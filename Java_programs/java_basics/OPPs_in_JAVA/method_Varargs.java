package java_basics.OPPs_in_JAVA;

// varargs - having many parameters like arrays in single name

class methodArgs{
    public static void getNames(String... names){ // method with varargs
        for(String name : names){ // enhanced for loop
            System.out.println(name);
        }
    }
}


public class method_Varargs {
    public static void main(String[] args) {
        // calling static method
        methodArgs.getNames("suresh","ramesh","sathish","rajesh","visu"); 
    }
}

