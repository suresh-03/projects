package Patterns;

public class Pattern35 {
    public static void main(String[] args) {
        print35(5);
    }
    static void print35(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }
            for(int space = 1; space <= n - row; space++){
                System.out.print(" ");
            }
            for(int space = 1; space <= n - row; space++){
                System.out.print(" ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col);
            }
            System.out.println(); 
            
        }
      
    }
}
