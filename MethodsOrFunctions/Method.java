import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        sum();
        greeting();
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the 1st number:");
        int num1 = in.nextInt();
        System.out.print("enter the 2nd number:");
        int num2 = in.nextInt();
        int total = num1 + num2;
        System.out.println("the sum is: " + total);
    }

    static void greeting() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = in.nextLine();
        System.out.println("welcome " + name + "!");
    }
}
