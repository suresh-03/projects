import java.util.Scanner;

public class P123 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int c = 2;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(0 + " ");
            } else if (i == 1) {
                System.out.print(1 + " ");
            } else if (i == 2) {
                System.out.print(2 + " ");
            } else {
                int d = a + b + c;
                System.out.print(d + " ");
                a = b;
                b = c;
                c = d;
            }

        }
    }
}
