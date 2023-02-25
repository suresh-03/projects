import java.util.Scanner;

public class P124 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 1;
        int temp = n;
        int b = 0;

        while (temp != 0) {
            int num = temp % 10;
            for (int i = 1; i <= num; i++) {
                a *= i;
            }
            b += a;
            temp /= 10;
            a = 1;
        }

        if (b == n) {
            System.out.print("true");

        } else {
            System.out.print("false");
        }
    }
}
