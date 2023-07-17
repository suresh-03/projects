import java.util.Scanner;

public class P282 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        
        int count = 0;
        int len = n.length();
        
        for(int i = 0; i < n.length(); i++){
            for(int j = 97; j <= 122; j++){
                if(n.charAt(i) == (char)j || n.charAt(i) == (char)(j - 32)){
                    count++;
                }
            }
        }
        
        int ans = len - count;
        if(count == 0){
            System.out.println(0);
        }
        System.out.print(ans);
    }
}
