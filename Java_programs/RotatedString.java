public class RotatedString {
  public static void main(String[] args) {
    String str = "gcmbf";
    String goal = "fgcmb";
    System.out.println(isRotated(str, goal));
  }

  public static boolean isRotated(String s, String goal) {

    String temp = s;
    String a = "";
    int count = s.length();

    while(count != 0){
      if(a.equals(goal)){
        return true;
      }
      else{
        
        char str = temp.charAt(0);
        a = "";
        for(int i = 1; i < s.length(); i++){
          a += temp.charAt(i);
        }
        a += str;
        temp = a;
      }
      count--;
    }

    return false;
    
}

}
