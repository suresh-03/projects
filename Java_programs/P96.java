import java.util.Scanner;
import java.util.ArrayList;

public class P96 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>(4);

        int temp = n;
        int sum = 0;
        int count = 0;

        while (temp != 0) {
            int num = temp % 10;
            list.add(num);
            temp /= 10;
            count++;
        }

        if (count % 2 == 0) {
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
        } else {
            int k = 1;
            int mid = list.size() / 2;
            sum += list.get(mid) + list.get(mid);
            for (int i = 0; i < mid; i++) {
                for (int j = list.size() - k; j > (list.size() - k) - 1; j--) {
                    sum += list.get(i) + list.get(j);
                }
                k++;

            }
        }
        System.out.println(sum);
        in.close();
    }
}
