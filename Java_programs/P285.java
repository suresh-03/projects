import java.util.ArrayList;
import java.util.Scanner;

public class P285 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String n = in.nextLine();
            ArrayList<Character> arr = new ArrayList<>(5);

            String ans = "";
            
            for(int i = 0; i < n.length(); i++){
                for(int j = 97; j <= 122; j++){
                    if(n.charAt(i) == (char)j){
                      arr.add((char)(j - 32));
                    }
                    else if(n.charAt(i) == (char)j - 32){
                        arr.add((char)j);
                    }
                }
            }

            for(int i = 0; i < arr.size(); i++){
                ans += arr.get(i);
            }
            
            // System.out.print(arr);
            System.out.println(ans);
        }
    }
}
