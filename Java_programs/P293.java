import java.util.Scanner;

public class P293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        
        int count = 1;
        
        for(int i = 0; i < n.length(); i++){

            char a = n.charAt(i);
            char b = (char)32;

            if(a == b){
                count++;
            }
        }
        
        System.out.print(count);
    }
}
