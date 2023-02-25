import java.util.Scanner;

public class P292 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        int c = 3;
        int i = 0;

        String ans = "";

        char[] arr = new char[100];

        while(c != 0){
            arr[i] = n.charAt(n.length() - 2);
            ans += arr[i];
            i++;
           
            arr[i] = n.charAt(n.length() - 1);
            ans += arr[i];
            i++;
           
            c--;
        }

        // for(int j = 0; j <= i; j++){
            
        // }

        System.out.println(ans);
        
       
        
        
        
        

        in.close();
    }
}
