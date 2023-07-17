package Patterns;

public class ribbonPattern{
    public static void main(String[] args) {
       print(10);
    }
    static void print(int n){
    
        for(int row = 1; row < (n * 2); row++){
            if(row > n){
                for(int col = 1; col <= (n * 2)-row; col++){
                    System.out.print("*");
                }
                for(int space = 1; space <= (row - n) * 2; space++){
                    System.out.print(" ");
                }
                for(int col = 1; col <= (n * 2)-row; col++){
                    System.out.print("*");
                }
            }else{
                for(int col = 1; col <= row; col++){
                    System.out.print("*");
                }
                for(int space = 1; space <= (n - row) * 2; space++){
                    System.out.print(" ");
                }
                for(int col = 1; col <= row; col++){
                    System.out.print("*");
                }
            }
         System.out.println();

        }
    }
}