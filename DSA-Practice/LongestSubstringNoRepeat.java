
public class LongestSubstringNoRepeat {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = start + 1;
        if(s.equals("")){
            return 0;
        }
        for(int i = 0; i < s.length(); i++){
            if(end < s.length()){
             
                    boolean repeat = find(start,end,s);
            if(repeat){
                start += 1;
                end++;
            }
            else{
                end++;
            }
            }
        }
        return end-start;
    }
    public static boolean find(int start, int end, String s){
        boolean ans = false;
        for(int i = start; i < end; i++){
            for(int j = i+1; j <= end; j++){
                if(s.charAt(i) == s.charAt(j)){
                    ans = true;
                }
          }
        }  
        return ans;
    }
}
