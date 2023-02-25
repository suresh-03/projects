import java.util.Scanner;

public class P135 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean t = true;

        int j = 1;
        int i = n + 1;

        while (t) {

            int ans = j * j;
            j++;
            if (ans > i) {
                i++;
                j = 1;
            } else if (ans == i) {
                System.out.print(i);
                t = false;
            }
        }
    }
}
