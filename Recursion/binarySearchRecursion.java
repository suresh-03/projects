public class binarySearchRecursion {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,2,3,4,5,6,7,8},6,0,7));
    }
    public static int binarySearch(int[] arr,int target, int start, int end){
            if(start > end){
                return -1;
            }
            int mid = (start + end)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                return binarySearch(arr,target,mid + 1, end);
            }
            else{
                return binarySearch(arr,target,start,mid -1);
            }
    }
}
