package Array_ArrayList;


import java.util.ArrayList;

public class arrayList {
    private static final String Array = null;

    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,5,6,7};
       ArrayList<Integer> list = new ArrayList<>();
      System.out.println(search1(arr, 5, 0, list));
      System.out.println(search2(arr, 5, 0));
    }

    static ArrayList search1(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return search1(arr, target, index + 1, list);
    }

    // method 2 - passing list inside the function but it is not optimised because
    // for each function call the function will new list it cause more memory usage
    // because of creating new lists agagin and again

    static ArrayList search2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> belowAll = search2(arr,target,index + 1);

        list.addAll(belowAll);
        return list;
    }
}
