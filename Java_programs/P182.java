import java.util.*;

public class P182 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int k = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                for (int j = k; j < n; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }

                }
                k++;
            }
        } else {
            for (int i = 0; i < (n / 2) - 1; i++) {
                for (int j = k; j < n; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }

                }
                k++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        in.close();
        
    }
}
