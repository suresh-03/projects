package search;



import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,4};
        System.out.println((searchAll(arr, 4, 0)));
    }
    static int search(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        return arr[index] == target ? index : search(arr, target, index + 1);
    }

    //---------------------------------------------------------------------------
    // if you don't want to declare the list or variables outside the function in
    // in recursion, just add this to the arguments of the recursive function

    static ArrayList<Integer> list = new ArrayList<>();

    static ArrayList<Integer> searchAll(int[] arr, int target, int index){
     
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
            return searchAll(arr, target, index + 1);
      
    }
}
