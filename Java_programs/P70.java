import java.util.Scanner;

public class P70 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int temp = n;
        int a = n;
        String sum = "";

        while (true) {
            while (temp != 0) {
                int num = temp % 10;
                sum += num;
                temp /= 10;
            }
            temp = a;
            String sum1 = Integer.toString(temp);
            if (sum.equals(sum1)) {

                System.out.print(sum);
                break;
            }
            temp++;
            a++;
            sum = "";

        }

        in.close();
    }
}
