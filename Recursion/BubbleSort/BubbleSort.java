package Recursion.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,5,4,1,3};
        sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int row, int col){
        if(row == 0){
            return;
        }
        if(row > col){
            if(arr[col + 1] < arr[col]){
                int temp = arr[col + 1];
                arr[col + 1] = arr[col];
                arr[col] = temp;
            }
            sort(arr,row, col + 1);
        }
        else{
            sort(arr,row - 1, 0);
        }
    }
}
