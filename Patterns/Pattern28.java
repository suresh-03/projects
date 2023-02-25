package Patterns;

public class Pattern28 {

    public static void main(String[] args) {
        print2(8);
    }
    public static void print2(int n){
        for(int row = 1; row < 2 * n; row++){
         int totalRows = row > n ? 2 * n - row : row;
         int noOfspaces = n - totalRows;
         for(int col = 1; col <= noOfspaces ; col++){
            System.out.print(" ");
         }
         for(int col = 0; col < totalRows; col++){
            System.out.print(" *");
        }
        System.out.println();
        
        }
    }
}

