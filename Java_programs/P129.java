import java.util.Scanner;

public class P129 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int count = 0;
        int sum = 0;

        for (int i = n1; i <= n2; i++) {
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                sum += i;
            }
            count = 0;
        }

        System.out.print(sum);
    }
}
