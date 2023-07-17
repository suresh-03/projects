package DSA_problems.Searching_Sorting.Easy;

import java.util.Arrays;

// https://www.geeksforgeeks.org/permute-two-arrays-sum-every-pair-greater-equal-k/

public class ArrayPermutations {
    public static void main(String[] args) {
        int[] a = {1,2,2,1};
        int[] b = {3,3,4,4};
        System.out.println(permutation(a, b, 5));
    }
    static boolean permutation(int[] a, int[] b, int k){
        Arrays.sort(a);
        Arrays.sort(b);
        int count = 0, j = a.length - 1;
        for(int i = 0; i < a.length; i++){
            int sum = a[i] + b[j];
            if(sum >= k){
                count++;
            }
            j--;
        } 
        if(count == a.length){
            return true;
        }
        return false;
    }
}
