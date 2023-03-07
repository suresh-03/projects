package Sorting.BubbleSort;

import java.util.Arrays;
import java.util.HashSet;

public class intersect2Arrays{
    public static void main(String[] args) {
    int[] a1 = {2,2,3,3};
    int[] a2 = {1,2,2};
    System.out.println(Arrays.toString(intersection(a1, a2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();


        for(int n : nums1){
            n1.add(n);
        }
        for(int k : nums2){
            n2.add(k);
        }

       

        if(n1.size() < n2.size()){
              return find(n1,n2);
            }
            return find(n2,n1);


     
        }

        public static int[] find(HashSet<Integer> n1, HashSet<Integer> n2){

            int index = 0;
            int[] arr = new int[n1.size()];
            for(Integer n : n1){
                if(n2.contains(n)){
                    arr[index++] = n;
                }
            }
            return Arrays.copyOf(arr, index);
        }
    }

