package Patterns;

public class rightTriangle {
    public static void main(String[] args) {
        print(7);
    }
    static void print(int n){
        for(int row = 1; row <= n; row++){

            if(row == 1){
                for(int col = 1; col <= n; col++){
                System.out.print(row);
                }
            }
            else{
                for(int col = 1; col < row; col++){
                    System.out.print("#");
                }
                for(int col = row; col <= n; col++){
                    System.out.print(row);
                }
            }
            System.out.println();
        }
    }
}
