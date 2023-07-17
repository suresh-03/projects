import java.util.Scanner;

public class P145SumOfPerfectNum1ToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sum = 0;
        int ans = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                ans += i;
            }
            sum = 0;
        }

        System.out.print(ans);
    }
}
