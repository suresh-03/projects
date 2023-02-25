import java.util.Scanner;

public class P290 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();

        String ans = "";
        for(int i = 0; i < n.length(); i++){
            if(n.charAt(i) == '.'){
                ans += "[.]";
            }
            else{
                ans += n.charAt(i);
            }
            
        }

        System.out.println(ans);
    }
}
