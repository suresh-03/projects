import java.util.Scanner;

public class P133 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                sum += 0;
            } else if (i == 2) {
                sum += 1;
            } else {
                int c = a + b;
                sum += c;
                a = b;
                b = c;
            }

        }

        System.out.print(sum);
    }
}
