import java.util.ArrayList;
import java.util.Scanner;

//similar to the integer arraylist

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(2);
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            list.add(in.next());
        }

        // functions in arraylist
        System.out.print(list);
        System.out.println();
        System.out.println(list.size());
        System.out.println(list.get(0));
        list.remove(1);
        System.out.println(list);
        System.out.println(list.contains("suresh"));
    }
}
