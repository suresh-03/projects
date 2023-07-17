import java.util.Scanner;

public class P300 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String a = in.nextLine();
            String b = in.nextLine();


            int count_a = 0;
            int count_b = 0;

            String temp_a = a.toUpperCase();
            String temp_b = b.toUpperCase();
            
            
            
            for(int i = 0; i < a.length(); i++){
                for(int j = 65; j <= 90; j++ ){
                    char c = (char)j;
                    if(temp_a.charAt(i) == c){
                        count_a++;
                    }
                }
            }
            for(int i = 0; i < b.length(); i++){
                for(int j = 65; j <= 90; j++ ){
                    char c = (char)j;
                    if(temp_b.charAt(i) == c){
                        count_b++;
                    }
                }
            }

            if(count_a == count_b){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
}
