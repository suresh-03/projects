package Strings;

import java.util.HashMap;

public class ShuffleString{
    public static void main(String[] args) {
        String a = "codeleet";
        int[] index = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(a, index));
    }
      public static String restoreString(String s, int[] indices) {

        String ans = "";
      
        HashMap<Integer,Character> a = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            a.put(indices[i],s.charAt(i));
        }
    
        for(int i = 0; i < a.size(); i++){
            if(a.containsKey(i)){
                ans += a.get(i);
            }
        }
        return ans;
    }
}