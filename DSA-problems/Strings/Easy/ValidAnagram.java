
// https://leetcode.com/problems/valid-anagram/

public class ValidAnagram {
  public static void main(String[] args) {
    System.out.println(isAnagram("anagram", "nagaram"));
  } 
  public static boolean isAnagram(String s, String t) {
        char[] arrs = new char[s.length()];
        char[] arrt = new char[t.length()];

        int si = 0;
        int ti = 0;

        while(si < s.length() || ti < t.length()){
          if(si < s.length()){
            arrs[si] = s.charAt(si);
            si++;
          }
          if(ti < t.length()){
            arrt[ti] = t.charAt(ti);
            ti++;
          }
        }

        for(int i = 0; i < arrs.length; i++){
          for(int j = 0; j < arrt.length; j++){
            if(arrs[i] == arrt[j]){
              arrs[i] = '0';
              arrt[j] = '0';
            }
          }
        }

        si = 0;
        ti = 0;

        while(si < arrs.length || ti < arrt.length){

        }

      
        return false;

  } 
}
