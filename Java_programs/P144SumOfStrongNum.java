import java.util.Scanner;

public class P144SumOfStrongNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int fact = 1;
        int sum = 0;
        int ans = 0;

        for (int i = 0; i <= n; i++) {
            int temp = i;
            while (temp != 0) {
                int num = temp % 10;
                for (int j = 1; j <= num; j++) {
                    fact *= j;
                }
                sum += fact;
                temp /= 10;
                fact = 1;
            }
            if (sum == i) {
                ans += i;
            }

            sum = 0;
        }
        System.out.print(ans);
    }
}
