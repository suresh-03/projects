import java.util.Scanner;

public class P212 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        int k = 1;
        
        for(int i = 0; i < n; i++){
            for(int j = k; j < n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            k++;
        }
        
        // for(int i = 0; i < n; i++){
        //     System.out.print(arr[i] + " ");
        // }

        int o = n/2;
        
        for(int i = n/2; i < n; i++){
            for(int j = o; j < n; j++){
                  if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            o++;
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}