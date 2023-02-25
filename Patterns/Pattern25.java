package Patterns;

public class Pattern25 {
    public static void main(String[] args) {
        print25(10);
    }
    static void print25(int n){
        for(int row = 1; row <= n; row++){
            for(int space = row; space <= n - 1; space++){
                System.out.print(" ");
            }
            for(int col = 1; col <= n; col++){
                if(row == 1 || row == n){
                    System.out.print("*");
                }
                else if(col == 1 || col == n){
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
