package java_basics;

class maths{
    public static int power(int base, int power){ // because of static member we dont need to create a object to call the function in main method
        int result = 1;
        for(int i = 0; i < power; i++){
            result *= base;
        }
        return result;
    }
}

public class staticMemberFunction {
    public static void main(String[] args) {
        System.out.println(maths.power(3, 2));
    }
}
