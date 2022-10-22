import java.util.Arrays;
import java.util.Scanner;

public class arrayInMehtod2 {
    public static void main(String[] args) {
        String[] names = new String[5];
        name(names);

        System.out.println(Arrays.toString(names));
    }

    static String[] name(String[] in) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < in.length; i++) {
            in[i] = input.next();
        }
        return in;
    }
}
