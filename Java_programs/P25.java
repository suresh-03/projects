import java.util.Scanner;

public class P25 {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        int[] arr1 = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int m1 = arr[0] - arr[1];
        int m2 = arr[2] - arr[3];
        int m3 = arr[4] - arr[5];

        arr1[0] = m1;
        arr1[1] = m2;
        arr1[2] = m3;

        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }

        System.out.print(max);
        in.close();
    }
}
