import java.util.Scanner;

public class P143SumOfArmstrong1ToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int ans = 0;
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            int temp = i;
            while (temp != 0) {
                int num = temp % 10;
                sum += (num * num * num);
                temp /= 10;
            }
            if (sum == i) {
                ans += i;
            }
            sum = 0;
        }

        System.out.print(ans);
    }
}
