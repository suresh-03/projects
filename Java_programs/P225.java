import java.util.Scanner;

public class P225 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        
        int temp = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                temp = arr[i];
                for(int j = i + 1; j < n; j++){ 
                    arr[j - 1] = arr[j];
                }
                arr[n - 1] = temp;
            }
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
