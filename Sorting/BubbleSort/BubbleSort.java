package Sorting.BubbleSort;

import java.util.Arrays;

/* bubble sort is also known as syncing sort and exchange sort
 * 
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        boolean swapped;
        for(int i = 0; i < arr.length - 1;i++){
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }
}
