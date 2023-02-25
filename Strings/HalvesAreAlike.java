package Strings;

public class HalvesAreAlike {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
      
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        String str = s.toLowerCase();

        int len = 0;
        int counta = 0;
        int countb = 0;
        int e = 0;
        int l = s.length() / 2;

        while(len < s.length() / 2){
            a.append(str.charAt(e));
            e++;
            b.append(str.charAt(l));
            l++;
            len++;
        }

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' ||
            a.charAt(i) == 'o' || a.charAt(i) == 'u'){
                counta++;
            }
            if(b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' ||
            b.charAt(i) == 'o' || b.charAt(i) == 'u'){
                countb++;
            }
        }

        if(counta == countb){
            return true;
        }
        return false;
        
    }
}
