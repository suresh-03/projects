import java.util.Scanner;

public class P287 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        
        int count = 0;
        
        for(int i = 0; i < n.length(); i++){
            for(int j = 97; j <= 122; j++){
                if(n.charAt(i) == (char)j || n.charAt(i) == (char)j - 32){
                    count++;
                }
            }
        }

        int ans = n.length() - count;
        
        System.out.print(ans);
    }
}
