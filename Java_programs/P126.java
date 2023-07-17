import java.util.Scanner;

public class P126 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        int a = 0;
        int b = 1;
        int d = 0;

        for (int i = 0; i < n; i++) {

            if (i == 0) {
                arr[i] = 0;
            }
            if (i == 1) {
                arr[i] = 1;
            }

            int c = a + b;
            arr[i] = c;
            a = b;
            b = c;
        }

        d = arr[(arr.length) - 1] + arr[(arr.length) - 2];

        System.out.print(d);
    }
}
