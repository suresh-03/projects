import java.util.Scanner;

public class P272 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){

                arr[i][j] = in.nextInt();
            }
        }
        
        
        
          for(int i = 0; i < arr.length; i++){
              int count = 0;
            for(int j = 0; j < arr[i].length; j++){
                int temp = arr[i][j];
                int temp1 = (int)Math.sqrt(temp);
                for(int k = 2; k <= temp1; k++){
                    if(temp % k == 0){
                        count++;
                    }
                    
                }
                
                if(arr[i][j] == 1 || arr[i][j] == 0){
                    count = 2;
                }
                if(count == 0){
                    sum += arr[i][j];
                }
               
                count = 0;
            }
               
                }
      
            System.out.println(sum);
    }
}
