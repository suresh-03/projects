package Patterns;

public class Pattern24 {
    public static void main(String[] args) {
        print24(10);
    }
    static void print24(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                if(col == 1 || col == row){
                    System.out.print("*");
                }
               else{
                System.out.print(" ");
               }
            }
            for(int space = 1; space <= n - row; space++){
                System.out.print(" ");
            }
            for(int space = 1; space <= n - row; space++){
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++){
                if(col == 1 || col == row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
              
            }
            System.out.println();
        }
        for(int row = 1; row <= n; row++){
            for(int col = row; col <= n; col++){
                if(col == row || col == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }    
            }
            for(int space = 1; space < row; space++){
                System.out.print(" ");
            }
            for(int space = 1; space < row; space++){
                System.out.print(" ");
            }
            for(int col = row; col <= n; col++){
                if(col == row || col == n){
                System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
