package java_basics;

import java.util.Arrays;

public class arrayIndexValueChange{
    public static void main(String[] args) {
        int index = 2;
        int value = 39;
        int[] arr = {10,20,30,40,50,60,70,80,90};

        for(int i = arr.length - 1; i > index; i--){
            arr[i] = arr[i - 1];
        }
        arr[index] = value;

        System.out.println(Arrays.toString(arr));
    }
}