
// https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "abcba";
        System.out.println(isPalindrome(s));
    }
    static public boolean isPalindrome(String s) {
        if(s.equals(" ")){
            return true;
        }
        StringBuilder str = new StringBuilder();
        StringBuilder strRev = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if((int)s.charAt(i) >= 97 && (int)s.charAt(i) <= 122 || (int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90 || (int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57){
                if((int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90){
                    str.append((char)((int)(s.charAt(i)) + 32));
                }
                else{
                    str.append(s.charAt(i));
                }
               
            }
        }
        for(int i = str.length() - 1; i >= 0; i--){
            strRev.append(str.charAt(i));
        }
        if(str.toString().equals(strRev.toString())){
            return true;
        }
        return false;
    }
}
