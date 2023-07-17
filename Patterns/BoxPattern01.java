package Patterns;

public class BoxPattern01 {
    public static void main(String[] args) {
        print(8);
    }
    static void print(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                if(row == 1 || row == n){
                    System.out.print("1");
                }
                else{
                    if(col == 1 || col == n){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
            }
            System.out.println();
        }
    }
}
