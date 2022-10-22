import java.util.Scanner;

public class ReturnMethod {
    public static void main(String[] args) {
        int total = multiply();
        System.out.println("multiplication is: " + total);
        String result = name();
        System.out.println("welcome " + result + "!");
    }
    static int multiply(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the 1st number: ");
        int num1 = in.nextInt();
        System.out.print("enter the 2nd number:");
        int num2 = in.nextInt();
        int result = num1 * num2;
        return result;
    }
    static String name(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter your name: ");
        String nam = in.nextLine();
        return nam;
    }
}
