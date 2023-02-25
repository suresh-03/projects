package Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        print13(5);
    }
    static void print13(int n){
        for(int row = 1; row <= n; row++){
            for(int space = row; space < n; space++){
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++){
                if(col == 1 || col == row){
                    System.out.print("*");
                }
                if(col == 1){
                    for(int space = col; space < row; space++){
                        System.out.print(" ");
                       }
                }
              
            }
            System.out.println(); 
        }
    }
}
