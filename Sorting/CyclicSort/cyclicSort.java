package Sorting.CyclicSort;

import java.util.Arrays;

// this will only works on 1 to n elements in array (2,3,4,5,6,1) like this

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){

        int i = 0;

       while(i < arr.length){
            if(arr[i] - 1 != i){
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
       }

        return arr;
    }
}
