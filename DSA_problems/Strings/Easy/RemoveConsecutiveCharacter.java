
// https://practice.geeksforgeeks.org/problems/consecutive-elements2306/1
public class RemoveConsecutiveCharacter {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveCharacter("aaabbcacc"));   
    }
    public static String removeConsecutiveCharacter(String s){
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(ans.charAt(ans.length()-1) != s.charAt(i)){
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}
