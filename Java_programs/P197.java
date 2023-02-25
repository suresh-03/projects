import java.util.*;

public class P197 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();

        result(n, arr, m);
    }
    
    public static void result(int n, int[] arr, int m){
        int pos = m;
        for(int i = pos; i < (n - 1); i++){
            arr[i] = arr[i + 1];
        }
        for(int i = 0; i < (n - 1); i++){
            System.out.print(arr[i] + " ");
        }
    }
}
