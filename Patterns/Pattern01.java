package Patterns;

public class Pattern01 {
    public static void main(String[] args) {
        print(8);
    }
    static void print(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                if(row % 2 != 0){
                    if(col % 2 != 0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
                else{
                    if(col % 2 != 0){
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
