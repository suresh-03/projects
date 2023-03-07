package Sorting.SelectionSort;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {90,54,634,234,45,123,-345,-234,0,-100};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){

        int len = arr.length - 1;

        int index = 0;
        int i = 0;

        while(i < len){
        
            int max = arr[0];
            for(int j = 0; j <= len; j++){
                if(max < arr[j]){
                    max = arr[j];
                    index = j;
                }
            }
            int temp = arr[len];
            arr[len] = max;
            arr[index] = temp;
            len--;
            index = 0;
        }
        
        return arr;
    }

}
