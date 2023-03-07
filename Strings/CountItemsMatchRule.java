package Strings;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchRule {
    public static void main(String[] args) {
        List<List<String>> a = new ArrayList<>();

        List<String> a1 = new ArrayList<>();
        a1.add("phone");
        a1.add("blue");
        a1.add("pixel");

        List<String> a2 = new ArrayList<>();
        a2.add("computer");
        a2.add("silver");
        a2.add("lenova");

        List<String> a3 = new ArrayList<>();
        a3.add("phone");
        a3.add("gold");
        a3.add("iphone");

        a.add(a1);
        a.add(a2);
        a.add(a3);

        String key = "color";
        String value = "silver";

        System.out.println(countMatches(a, key, value));

        
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        String[] arr = {"type","color","name"};
        int count = 0;

        for(int i = 0; i < items.size(); i++){
            for(int j = 0; j < items.get(i).size(); j++){
                String key = arr[j];
                if(ruleKey.equals(key) && items.get(i).get(j).equals(ruleValue)){
                    count++;
                }
            }
        }

        return count;
    }
}
