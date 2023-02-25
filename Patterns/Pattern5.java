package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        print1(5);
    }
    public static void print1(int n){
       
        for(int row = 1; row < 2 * n; row++){
            
            if(row > n){
                for(int col = row - n; col < n; col++){
                    System.out.print("*");
                }
            }
            else{
                for(int col = 1; col <= row; col++){
                    System.out.print("*");
            }
        }
            
            System.out.println();
        }
    }

  

    

 

   
   



    
    
}


