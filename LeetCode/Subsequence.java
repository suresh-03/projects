import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        String s = "aaaaaa";
        String t = "bbaaaa";
        System.out.println(isSubsequence(s, t));
    }
    public  static boolean isSubsequence(String s, String t) {
      ArrayList<Integer> index = new ArrayList<>();

        int count = 0;
        int j = 0;
        
    
        for(int i = 0; i < s.length();i++){
           
            int len = t.length();
            while(len != 0){
                if(s.charAt(i) == t.charAt(j)){
                    index.add(j);
                    j++;
                    break;
                }
                j++;
                len--;
            }
            if(j == t.length()){
                j--;
            }
        }

        if(index.size() == s.length()){
            for(int i = 0; i < index.size() - 1; i++){
                if(index.get(i) > index.get(index.size() - 1)){
                    count++;
                }
            }
            if(count == 0){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
