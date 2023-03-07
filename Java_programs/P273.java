import java.util.ArrayList;
import java.util.Scanner;

public class P273 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        ArrayList<Integer> a = new ArrayList<>(10);
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){

                arr[i][j] = in.nextInt();
            }
        }
        
        
        
          for(int i = 0; i < arr.length; i++){
               int count = 0;
            for(int j = 0; j < arr[i].length; j++){
                int temp = arr[i][j];
                while(temp != 0){
                    int t = temp % 10;
                    int temp1 = (int) Math.sqrt(t);
                    for(int k = 2; k <= temp1; k++){
                        if(temp % k == 0){
                            count++;
                        }
                    }
                    if(t == 1 || t == 0){
                        count = 2;
                    }

                    if(arr[i][j] == 1 || arr[i][j] == 0){
                        count = 2;
                    }
                     else if((count) == 0){
                a.add(arr[i][j]);
            }
                count = 0;
                    temp /= 10; 
                }
               
                
            }
                  
        }
        
      
            System.out.println(a.size());
    }
}
