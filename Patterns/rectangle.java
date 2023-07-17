package Patterns;

public class rectangle {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        int a = 0;
        for(int row = 1; row <= n; row++){
            for(int space = row; space < n; space++){
                System.out.print(" ");
            }
            for(int col = 1; col <= row + a; col++){
              
    
                if(col == 1 || col == row + a){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               
            }
            //----------------------------------------
            for(int space = row + a; space < (n * 2)-1; space++){
                System.out.print(" ");
            }
            for(int col = 1; col <= row + a; col++){
              
    
                if(col == 1 || col == row + a){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               
            }
            a++;
            System.out.println();
        }
        
    }
}


