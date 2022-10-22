//note:
/*
 * we can't change the string value after once it is assigned
 * because strings are immutable.
 */

public class WorkOfSwap {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        change(a, b);// it will not change because we are creating new object in change method.
        System.out.println(a + " " + b);
    }

    static void change(int num1, int num2) {
        int temp = num1;// here num1 and num2 are a new object.
        num1 = num2;
        num2 = temp;
    }

}