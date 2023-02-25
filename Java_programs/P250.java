import java.util.Scanner;

public class P250 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[] a = new int[9];

        int k  = 0;
        int l = 0;
        int p = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                a[k] = arr[i][j];
                k++;
            }
        }

     

      

        for(int i = 0; i < a.length; i++){
           for(int j = l; j < a.length; j++){
            if(a[i] > a[j]){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
           }
           l++;
        }


        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = a[p];
                p++;
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
