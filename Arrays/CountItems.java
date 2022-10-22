import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountItems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<List<String>> items = new ArrayList<>(3);

        List<String> list1 = new ArrayList<String>();
        list1.add("phone");
        list1.add("white");
        list1.add("realme");
        items.add(list1);

        List<String> list2 = new ArrayList<String>();
        list2.add("phone");
        list2.add("black");
        list2.add("apple");
        items.add(list2);

        List<String> list3 = new ArrayList<String>();
        list3.add("phone");
        list3.add("red");
        list3.add("realme");
        items.add(list3);

        int result = countitems(items, "type", "phone");
        System.out.println(result);
    }

    public static int countitems(List<List<String>> items, String ruleKey, String ruleValue) {
        if (ruleKey == "type") {
            int a = 0;
            for (int i = 0; i < items.size(); i++) {
                int j = 0;

                if (items.get(i).get(j) == ruleValue) {
                    a += 1;
                }
            }
            return a;
        } else if (ruleKey == "color") {
            int a = 0;
            for (int i = 0; i < items.size(); i++) {
                int j = 1;
                if (items.get(i).get(j) == ruleValue) {
                    a += 1;
                }
            }
            return a;
        } else if (ruleKey == "name") {
            int a = 0;
            for (int i = 0; i < items.size(); i++) {
                int j = 2;
                if (items.get(i).get(j) == ruleValue) {
                    a += 1;
                }
            }
            return a;
        }
        return 0;
    }
}
