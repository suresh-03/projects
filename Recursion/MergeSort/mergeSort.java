package Recursion.MergeSort;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] first, int[] second){

        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // will work if the one of the array has more elements when other array is 
        // less elements for comparision
        /*
         * ex:
         * a1 = [1,2]
         * b1 = [3,4,5,6]
         * 
         * here 5 and 6 are extra that are added to the mix array
         */

        while(i < first.length){
            mix[k] = first[i];
            k++;
            i++;
        }
        while(i < first.length){
            mix[k] = second[j];
            k++;
            j++;
        }
        return mix;
        
    }
}
