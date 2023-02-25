import java.util.Scanner;

public class P63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int temp = n;
        String sum = "";

        while (temp != 0) {
            int num = temp % 10;
            sum += num;
            temp /= 10;
        }
        String v = Integer.toString(n);

        if (sum.equals(v)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
