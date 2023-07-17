package Patterns;

public class PatternHash{
    public static void main(String[] args) {
        int n = 8;
        for(int row = 2*n; row >= 1; row--){
      
        if(row > n){
          for(int str = ((2*n)-row)+1; str >= 1; str--){
            System.out.print("*");
          }
          for(int hash = 1; hash <= ((2*row)-(2*n))-2; hash++){
            System.out.print("#");
          }
          for(int str = ((2*n)-row)+1; str >= 1; str--){
            System.out.print("*");
          }
        }
        else{
      
          for(int str = 1; str <= row; str++){
            System.out.print("*");
          }
          for(int hash = 1; hash <=  (2*n)-(2*row); hash++){
            System.out.print("#");
          }
          for(int str = 1; str <= row; str++){
            System.out.print("*");
          }
        }
        
        System.out.println();
        }
    }
}