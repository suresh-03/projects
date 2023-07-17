package DSA_problems.Strings.Easy;

import java.util.HashMap;

// https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/
public class DuplicatesInString {
    public static void main(String[] args) {
        System.out.println(PrintDuplicate("sureshhhhhsssuuuyyydd"));
    }
    public static String PrintDuplicate(String word){
        HashMap<Character,Integer> ans = new HashMap<>();
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            for(int j = i+1; j < word.length(); j++){
                if(word.charAt(i) == word.charAt(j)){
                    count++;
                }
            }
            if(count > 0){
                if(!ans.containsKey(word.charAt(i))){
                    ans.put(word.charAt(i), count+1);
                }
               
            }
            count = 0;
        }
        return ans.toString();
    }
}
