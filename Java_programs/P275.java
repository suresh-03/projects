import java.util.Scanner;

public class P275 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){


                arr[i][j] = in.nextInt();
            }
        }
          for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                int temp = arr[i][j];
                String sum = "";
                while(temp != 0){
                    int n = temp % 10;
                    String k = Integer.toString(n);
                    sum += k;
                    temp /= 10;
                }

               int sumv = Integer.parseInt(sum);
                
                if(sumv != arr[i][j]){
                    arr[i][j] = 0;
                }
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
