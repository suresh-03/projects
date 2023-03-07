package Patterns;

public class Diamond {
    public static void main(String[] args) {
        print(10);
    }
    static void print(int n){
        for(int row = 1; row <= n; row++){
            for(int col = row; col <= n; col++){
                System.out.print(" ");
            }
            for(int col = 1; col <= (row * 2) - 1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row = n - 1; row >= 1; row--){
            for(int col = n; col >= row; col--){
                System.out.print(" ");
            }
            for(int col = ((row) * 2) - 1; col >= 1; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
