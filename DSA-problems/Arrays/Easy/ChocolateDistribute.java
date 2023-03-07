package Easy;

public class ChocolateDistribute{

    // https://www.geeksforgeeks.org/chocolate-distribution-problem/
    public static void main(String[] args) {
        System.out.println(find(new int[]{3, 4, 1, 9, 56, 7, 9, 12}, 5));
    }
    static int find(int[] arr, int m){
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int min = arr[arr.length - 1];
        
        for(int i = 0; i < (arr.length - m) + 1; i++){
            int ans = arr[m - 1 + i] - arr[i];
            if(ans < min){
                min = ans;
            }
        }
        return min;
    }
}