import java.util.Scanner;

public class P255 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int[][] arr = new int[3][3];

      int l = 0;
    
       for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr[i].length; j++){
            arr[i][j] = in.nextInt();
        }
       }

       for(int i = 0; i < arr.length; i++){
         for(int j = 0; j < arr[i].length; j++){
            if(j != 2){
                for(int k = 1; k < arr.length; k++){
                    if(arr[j][i] < arr[k][i]){
                        int temp = arr[j][i];
                        arr[j][i] = arr[k][i];
                        arr[k][i] = temp;
                }
            }
            }
            
        }
       }

       for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr[i].length; j++){
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
        in.close();
       }
    }
}
