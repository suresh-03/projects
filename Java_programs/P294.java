import java.util.Scanner;

public class P294 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n1 = in.nextLine();
        String n2 = in.nextLine();
        
        int count = 0;
        
        char b = n2.charAt(n2.length() - 1);
        int len = n2.length();
        
        for(int i = n1.length() - 1; i >= 0; i--){
            char a = b;
            if(len != 0){
                if(n1.charAt(i) == a){
                    count++;
                }
                b--;
                len--;
            }
           
        }
        
        if(count == n2.length()){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}
