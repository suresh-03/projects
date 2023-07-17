import java.util.Scanner;abstract

public class P141 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
         int n2 = in.nextInt();
         int n3 = in.nextInt();
        
        int[] arr1 = new int[4];
          int[] arr2= new int[4];
          int[] arr3= new int[4];
        
        int j = 0;
        int temp = n1;
        int i = 3;
        
        while(i != 0){
          
            
            while(temp != 0){
                int num = temp % 10;
                if(i == 3){
                    arr1[j] = num;
                    temp /= 10;
                    j++;
                }
                else if(i == 2){
                    arr2[j] = num;
                    temp /= 10;
                    j++;
                }
                else{
                    arr3[j] = num;
                    temp /= 10;
                    j++;
                }
                 
            }
            j = 0;
            i--;
            if(i == 2){
                temp = n2;
            }
            else{
                temp = n3;
            }
        }
        
        int max1 = arr1[0];
        for(int k = 0; k < arr1.length; k++){
            if(arr1[k] > max1){
                max1 = arr1[k];
            }
        }
             int max2 = arr2[0];
        for(int k = 0; k < arr2.length; k++){
            if(arr2[k] > max2){
                max2 = arr2[k];
            }
        }
             int max3 = arr3[0];
        for(int k = 0; k < arr3.length; k++){
            if(arr3[k] > max3){
                max3 = arr3[k];
            }
        }
            
            
            int min1 = arr1[0];
            for(int k = 0; k < arr1.length; k++){
                if(arr1[k] < min1){
                    min1 = arr1[k];
                }
            }
             int min2 = arr2[0];
            for(int k = 0; k < arr2.length; k++){
                if(arr2[k] < min2){
                    min2 = arr2[k];
                }
            }
             int min3 = arr3[0];
            for(int k = 0; k < arr3.length; k++){
                if(arr3[k] < min3){
                    min3 = arr3[k];
                }
            }
            
            int min = min1 + min2 + min3;
            int max = max1 + max2 + max3;
            
            int ans = 0;
            if(max > min){
                ans = max - min;
            }
            else{
                ans = min - max;
            }
            
            System.out.print(ans);

    }
}
