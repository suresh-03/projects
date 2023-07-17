import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        String s = "suresh";
        reverse(s.toCharArray(),0,s.length()-1);
    }
      public static void reverse(char[] s, int start, int end){
        if(start >= end){
            System.out.print(Arrays.toString(s));
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        reverse(s,start+1,end-1);
    }
}
