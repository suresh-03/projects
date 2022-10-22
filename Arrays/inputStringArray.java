import java.util.Arrays;
import java.util.Scanner;

public class inputStringArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] names = new String[3];

        for(int i = 0; i < names.length; i++){
            System.out.print("enter name "+i+" : ");
            names[i] = in.next();
        }

        System.out.println(Arrays.toString(names));
    }
}
