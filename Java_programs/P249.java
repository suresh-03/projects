import java.util.Scanner;

public class P249{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
         int[][] arr1 = new int[3][3];
         int[][] mul = new int[3][3];
     
        for(int i = 0; i < arr.length; i++){
         for(int j = 0; j < arr[i].length; j++){
             arr[i][j] = in.nextInt();
         }
        }
                for(int i = 0; i < arr.length; i++){
         for(int j = 0; j < arr[i].length; j++){
             arr1[i][j] = in.nextInt();
         }
        }

        int a = 3;
        int k = 0;
        int l = 0;
        int b = 0;
        int c = 0;
        int count = 0;

         
         for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                int sum = 0;
                while(a != 0){
                    int temp = arr[i][b] * arr1[b][k];
                    sum += temp;
                    mul[i][c] = sum;
                    b++;
                    a--;
                }
                k++;
                c++;
                b = 0;
                a = 3;
                count++;
                if(count == 3){
                    a = 0;
                }
            }
            k = 0;
            c = 0;
            a = 3;
            count = 0;
            }

             for(int i = 0; i < mul.length; i++){
                for(int j = 0; j < mul[i].length; j++){
                    System.out.print(mul[i][j] + " ");
                }
                System.out.println();
             }
    }
}