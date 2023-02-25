package LinearSearch;

public class linearSearchRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int s = 2;
        int e = 4;
        int target = 3;
        System.out.println(search(s, e, arr, target));
    }
    static boolean search(int start, int end, int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        else{
            for(int i = start; i <= end; i++){
                if(arr[i] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
