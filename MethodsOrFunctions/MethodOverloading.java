/*
 * In method overloading, the two or more functions name
 * are same.if that happens it give error.so, if we want
 * to overload a method we have to seperate their 
 * representation with no of parameters or the data type of
 * the parameters.
 */

public class MethodOverloading {
    public static void main(String[] args) {
        funcInt(1, 2);
        funcInt(3);
        func(4);
        func("suresh");
    }

    static void funcInt(int a) {
        System.out.println(a);
    }

    /*
     * here the function is differed from no of parameters.
     */
    static void funcInt(int a, int b) {
        System.out.println(a + " " + b);
    }

    static void func(int n) {
        System.out.println(n);
    }

    /*
     * here these methods are differed with same no of
     * parameters with different data types.
     */
    static void func(String n) {
        System.out.println(n);
    }
}
