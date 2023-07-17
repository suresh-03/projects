package Patterns;

public class Plus01 {
    public static void main(String[] args) {
        print(9);
    }
    static void print(int n){
        if(n % 2 == 0){
            n = n-1;
        }
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                if(row == (n/2)+1){
                    System.out.print("0");
                }
                else{
                    if(col == (n/2)+1){
                        System.out.print("0");
                    }
                    else{
                        System.out.print("1");
                    }
                }
            }
            System.out.println();
        }
    }
}
