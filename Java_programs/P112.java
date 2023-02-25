import java.util.Scanner;

public class P112 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
     
        int a = 1;
        int b = 0;
        
       
        for(int i = 0; i < n; i++){
            if(i == 0){
                System.out.print(0 + " ");
            }
            else if(i == 1){
                System.out.print(1 + " ");
            }
        else{
            int c = a + b;
            System.out.print(c + " ");
            b = a;
            a = c;
        }
           
         
    }
    }
}
