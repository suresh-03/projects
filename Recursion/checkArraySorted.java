public class checkArraySorted {
    public static void main(String[] args) {
        int[] arr = {7,8,9,6,10};
        System.out.println(check(arr, arr.length));
    }
    public static boolean check(int[] arr,int n){
        if(n == 1){
            return true;
        }
        if(arr[n-1] < arr[n-2]){
            return false;
        }
        return check(arr,n-1);
    }
}
