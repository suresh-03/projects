package Patterns;

public class PatternHash2{
    public static void main(String[] args) {
        print(4);
    }
    static void print(int n){
        for(int row = 1; row <= 2*n; row++){
            if(row > n){
                for(int str = n; str < row; str++){
                    System.out.print("*");
                }
                for(int hash = 1; hash <= (2*n-row)*2; hash++){
                    System.out.print("#");
                }
                for(int str = n; str < row; str++){
                    System.out.print("*");
                }
            }
            else{
                for(int str = n; str >= row; str--){
                    System.out.print("*");
                }
                for(int hash = 1; hash <= (2*row)-2; hash++){
                    System.out.print("#");
                }
                for(int str = n; str >= row; str--){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}