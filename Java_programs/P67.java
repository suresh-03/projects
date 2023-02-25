import java.util.Scanner;

public class P67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int temp = n;
        int sum = 0;
        int count = 0;

        while (temp != 0) {
            int num = temp % 10;
            for (int i = num - 1; i > 1; i--) {

                if (num != 1 && num % i == 0) {
                    count = 1;
                    break;
                } else {
                    count = 0;
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
