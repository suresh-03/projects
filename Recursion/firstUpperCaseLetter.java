public class firstUpperCaseLetter {
    public static void main(String[] args) {
        String str = "sureshKumar";
        findUpperCase(str,0);
    }
    public static void findUpperCase(String str,int n){
        if(n == str.length()){
            return;
        }
      if(str.charAt(n) >= 'A' && str.charAt(n) <= 'Z'){
        System.out.println(str.charAt(n));
        return;
      }
      findUpperCase(str,n+1);
    }
}
