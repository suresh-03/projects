import java.util.Scanner;

public class P155SumOfPrimesInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
        int sum = 0;
        int count = 0;
        
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                count++;
            }
            else{
                  for(int j = arr[i] - 1; j > 1; j--){
                if(arr[i] % j == 0){
                    count++;
                }
               
                }
            }
          
             if(count == 0){
                    sum += arr[i];
            }
            count = 0;
            
        }
        System.out.print(sum);
    }
}
