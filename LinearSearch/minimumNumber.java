package LinearSearch;

public class minimumNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,-7};
        System.out.println(minimim(arr));
    }
    static int minimim(int[] arr){
        int min = arr[0];
        if(arr.length == 0){
            return -1;
        }
     
        else{
            for(int i = 0; i < arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
        }
        return min;
    }
}
