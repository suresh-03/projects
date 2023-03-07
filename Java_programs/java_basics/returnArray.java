package java_basics;

import java.util.Arrays;

public class returnArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(array()));

        //another method to print
        int arr[] = array();
        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
    }
    public static int[] array(){
        return new int[]{1,2,3,4,5};
    }
}
