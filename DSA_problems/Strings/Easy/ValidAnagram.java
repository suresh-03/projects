
// https://leetcode.com/problems/valid-anagram/

public class ValidAnagram {
  public static void main(String[] args) {
    System.out.println(isAnagram("a", "ab"));
  } 
  public static boolean isAnagram(String s, String t) {

    StringBuilder strs = new StringBuilder(s);
    StringBuilder strt = new StringBuilder(t);

    for(int i = 0; i < strs.length(); i++){
      for(int j = 0; j < strt.length(); j++){
        if(strs.charAt(i) == strt.charAt(j)){
          strs = strs.replace(i, i+1, "");
          strt = strt.replace(j, j+1, "");
          j=0;
          i=0;
          break;
        }
       
      }
    }
    if(strs.toString().equals(strt.toString()))
{
  return true;
}
      
        return false;

  } 
}
