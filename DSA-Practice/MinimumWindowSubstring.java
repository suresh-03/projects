
public class MinimumWindowSubstring {
    public static void main(String[] args) {
        System.out.println(minWindow("bbaa","aba"));
    }
       public static String minWindow(String s, String t) {
      if(s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()){
        return new String();
      }
      int[] map = new int[128];
      for(char c : t.toCharArray()){
        map[c]++;
      }
      char[] chs = s.toCharArray();
      int count = t.length();
      int start = 0,end = 0,min = Integer.MAX_VALUE,index = 0;
      while(end < s.length()){
        if(map[chs[end++]]-- > 0){
            count--;
        }
        while(count == 0){
            if(min > end - start){
                min = end - start;
                index = start;
            }
            if(map[chs[start++]]++ == 0){
                count++;
            }
        }
      }

      return min == Integer.MAX_VALUE ? new String() : new String(chs, index, min);

     }
}
