import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/longest-common-prefix/

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix2(new String[]{"abab","aba","a"}));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        ArrayList<Character> temp = new ArrayList<>();
        int k = 0;
        int j = k;
        while(true){
            for(int i = 0; i < strs.length; i++){
                if(strs[i].length()-1 >= k){
                    for( j = k; j <= k; j++){
                        temp.add(strs[i].charAt(j));
                    }
                } 
                else{
                    temp.clear();
                    break;
                }
            }
            boolean yes = false;
            for(int i = 0; i < temp.size(); i++){
                if(i != temp.size()-1){
                    if(temp.get(i) == temp.get(i+1)){
                        yes = true;
                    }
                    else{
                        yes = false;
                        break;
                    }
                }
            }
            temp.clear();
            if(yes){
                ans.append(strs[0].charAt(k));
            }
            if(!yes){
                break;
            }
            k++;
            j=k;
        }

        return ans.toString();
    }

    // approach 2:-

    public static String longestCommonPrefix2(String[] strs){
        Arrays.sort(strs);
        int index = 0;
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        while(index < s1.length() && index < s2.length()){
            if(s1.charAt(index) == s2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        return s1.substring(0, index);
    }
}
