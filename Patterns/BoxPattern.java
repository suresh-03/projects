package Patterns;

public class BoxPattern {
    public static void main(String[] args) {
        print(7);
    }
    static void print(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                if(n%2 == 0){
                    if(row == n/2 || row == (n/2)+1){
                        if(col == n/2 || col == (n/2)+1){
                            System.out.print("0");
                        }
                        else{
                            System.out.print("1");
                        }
                    }
                    else{
                        System.out.print("1");
                    }
                }
                else{
                    if(row == (n/2)+1){
                        if(col == (n/2)+1){
                            System.out.print("0");
                        }
                        else{
                            System.out.print("1");
                        }
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
