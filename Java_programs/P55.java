import java.util.*;

public class P55 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int temp = n;
        int sum = 0;
        int count = 0;

        while (temp != 0) {
            int num = temp % 10;
            if (num == 2) {
                sum += num;
            }
            for (int i = num - 1; i > 1; i--) {

                if (num != 1 && num % i != 0) {
                    count = 1;
                } else {
                    count = 0;
                    break;
                }
            }
            if (count == 1) {
                sum += num;
            }
            temp /= 10;
            count = 0;
        }

        System.out.print(sum);
        in.close();
    }
}