package Patterns;

public class Pattern30 {
    public static void main(String[] args) {
        print30(5);
    }
    static void print30(int n){
        for(int row = 1; row <= n; row++){
            for(int space = row; space < n; space++){
                System.out.print("  ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
