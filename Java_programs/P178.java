import java.util.*;

public class P178 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> arr1 = new ArrayList<>(1);

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        arr1.add(0);
        int l = 1;
        int count = 0;
        int time = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = 0; k < l; k++) {

                        if (arr[i] != arr1.get(k)) {
                            count++;
                        }
                    }
                    if (count == l) {
                        arr1.add(arr[i]);
                        System.out.print(arr[i] + " ");
                        l++;
                    }

                    count = 0;

                }

            }

            for (int s = 0; s < arr1.size(); s++) {
                if (arr[i] != arr1.get(s)) {
                    time++;
                }
            }

            if (time == arr1.size()) {
                arr1.add(arr[i]);
                System.out.print(arr[i] + " ");
                l++;
            }

            time = 0;

        }
    }
}
