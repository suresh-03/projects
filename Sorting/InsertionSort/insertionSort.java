package Sorting.InsertionSort;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){

        for(int i = 0; i <= arr.length - 2; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                else{
                    break;
                }
            }
        }

        return arr;
    }
}
