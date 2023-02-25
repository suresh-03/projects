package LinearSearch;

public class linearSearchArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        else{
           for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
           }
        }
        return -1;
    }
}