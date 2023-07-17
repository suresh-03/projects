import java.util.Scanner;

public class P271 {
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
            for(int j = 0; j < arr[i].length; j++){
               int temp = i + j;
               if(temp % 2 != 0){
                sum += arr[i][j];
               }
            }
        }
        
        System.out.println(sum);
    }
}
