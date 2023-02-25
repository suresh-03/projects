import java.util.Scanner;

public class P156SumOfPalindromeInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        int sum = 0;
        String str = "";

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            while (temp != 0) {
                int num = temp % 10;
                str += num;
                temp /= 10;
            }
            int a = Integer.parseInt(str);
            if (a == arr[i]) {
                sum += arr[i];
            }
            str = "";
        }

        System.out.print(sum);

    }
}
