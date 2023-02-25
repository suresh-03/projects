package Patterns;

public class Pattern31 {
    public static void main(String[] args) {
        print31(6);
    }
    static void print31(int n){
        int n1 = 2 * n;
        int real = n;
        for(int row = 1; row < 2 * n; row++){
            for(int col = 1; col < 2 * n; col++){
                System.out.print(((real - Math.min(Math.min(row,col),Math.min(n1 - col,n1-row))) + 1) + " ");
            }
            System.out.println();
        }
    }
}
