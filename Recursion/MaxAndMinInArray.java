public class MaxAndMinInArray {
    public static void main(String[] args) {
        int[] arr = {-1,89,54,43,3452,1,-9,-645};
        System.out.println(findMin(arr,arr.length));

    }
    public static int MaxAndMin(int[] arr,int max,int temp){
        if(temp == arr.length){
            return max;
        }
        return arr[temp] > max ? MaxAndMin(arr,arr[temp],temp+1) : MaxAndMin(arr,max,temp+1); 
    }
    // another method
    public static int findMin(int[] arr,int n){
        if(n == 1){
            return arr[0];
        }
        return Math.min(arr[n-1],findMin(arr,n-1));
    }
}
