import java.util.HashMap;

// https://www.geeksforgeeks.org/convert-sentence-equivalent-mobile-numeric-keypad-sequence/
public class StringToMobileNumeric {
    public static void main(String[] args) {
        System.out.println(stringToMobileNumber("SURESHKUMARZ"));
    }
    public static String stringToMobileNumber(String sentence){
       String[] words = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
       String[] num = {"2","3","4","5","6","7","8","9"};
       StringBuilder ans = new StringBuilder();
       
       for(int i = 0; i < sentence.length(); i++){
        for(int j = 0; j < words.length; j++){
            for(int k = 0; k < words[j].length(); k++){
                if(sentence.charAt(i) == words[j].charAt(k)){
                    for(int count = 0; count <= k; count++){
                        ans.append(num[j]);
                    }
                    k = words[j].length()-1;
                        j = words.length-1;
                }
            }
        }
       }
       return ans.toString();
    }
}
