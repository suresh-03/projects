package DSA_problems.Searching_Sorting.Easy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

// https://practice.geeksforgeeks.org/problems/common-elements1132/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

public class CommonElementsArray {
    public static void main(String[] args) {
        int[] a = {1,5,10,20,40,80};
        int[] b = {6,7,20,80,100};
        int[] c = {3,4,15,20,30,70,80,120};
        System.out.println(find(a, b, c));
    }
    static ArrayList<Integer> find(int[] a, int[] b, int[] c){
        HashSet<Integer> arr = new HashSet<>();
        for(int i = 0; i < a.length; i++){
            Integer target = a[i];
            boolean B = binarySearch(b,target);
            Boolean C = binarySearch(c,target);
            if(B && C){
                arr.add(target);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>(arr);
        Collections.sort(ans);
      
        return ans;
    }
    static boolean binarySearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return true;
            }
            if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}
