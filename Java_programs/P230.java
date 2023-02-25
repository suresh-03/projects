import java.util.Scanner;

public class P230 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
         
     
        for(int i = 0; i < arr.length; i++){
         for(int j = 0; j < arr[i].length; j++){
             arr[i][j] = in.nextInt();
         }
        }
        
         int sum = 0;
        int count = 0;
        int a = 1;
        
         for(int i = 0; i < arr.length; i++){
         for(int j = 0; j < arr[i].length; j++){
            int temp = arr[i][j];
             while(a > 0){
                    for(int k = 2; k < temp; k++){
                        if(temp % k == 0){
                            count++;
                        }
                    }
                
                 
                 a--;
             }
             if(arr[i][j] != 1){
                if((count) == 0){
                    sum += arr[i][j];
                }
             }
             count = 0;
             a = 1;
             
         }
        }
        
        System.out.println(sum);
    }
}
