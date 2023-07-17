
import java.util.*;

public class P56 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>(3);

        int temp = n;
        int k = 1;

        while (temp != 0) {
            int num = temp % 10;
            list.add(num);
            temp /= 10;
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = k; j < list.size(); j++) {
                int temp1 = list.get(i) + list.get(j);
                if (temp1 % 3 == 0) {
                    System.out.print(temp);
                    break;
                }
            }
            k++;
        }
    }
}
