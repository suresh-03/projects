package java_basics;

public class stringToggle {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("welcome mr suresh kumar!");
        if(s.charAt(0) >= 65 && s.charAt(0) <= 90){
            int c = (int) s.charAt(0) + 32;
            s.setCharAt(0, (char)c);
        }

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == 32){
                i++;
                if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                    int c = (int) s.charAt(i) + 32;
                    s.setCharAt(i,(char)c);
                }
            }
            else{
                if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
                    int c = (int) s.charAt(i) - 32;
                    s.setCharAt(i,(char)c);
                }
            }
        }

        System.out.println(s);
    }
}
