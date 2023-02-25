package Strings;

import java.util.Arrays;

public class SortingSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("hello1 you4 how2 are3"));
    }
    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        int i = 1;
        String ans = "";

       for(i = 1; i <= arr.length; i++){
       
        char c = (char)(i + 48);
        for(int j = 0; j < arr.length; j++){
            if(arr[j].charAt(arr[j].length() - 1) == c){
                for(int k = 0; k < arr[j].length() - 1; k++){
                    ans += arr[j].charAt(k);
                }
                ans += " ";
            }
        }
       }
      

        String ans1 = ans.stripTrailing();
        return ans1;
    }
}
