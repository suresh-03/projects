import java.util.ArrayList;
import java.util.Scanner;

public class P297 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n1 = in.nextLine();
        String n2 = in.nextLine();

        ArrayList<Character> arr = new ArrayList<Character>(4);

        for(int i = 0; i < n1.length(); i++){
            arr.add(n1.charAt(i));
        }

        for(int i = 0; i < n1.length(); i++){
            for(int j = 97; j <= 122; j++){
                char c = (char)j;
                if(arr.get(0) == c){
                    arr.set(0,(char)(j - 32));
                }
            }
        }

        // System.out.println(arr);

        String N1 = "";
        for(int i = 0; i < arr.size(); i++){
            N1 += arr.get(i);
        }
        
       // Character.isUpperCase(temp_n1.charAt(0)); not working..


       System.out.println(N1 + n2);
      
     
    }
}
