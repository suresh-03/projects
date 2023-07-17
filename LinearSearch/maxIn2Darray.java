package LinearSearch;

public class maxIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {45,67,4,2},
            {89,100}
        };

        System.out.println(maximum(arr));
    }
    static int maximum(int[][] arr){
        int max = arr[0][0];
        for(int[] a : arr){
            for(int b : a){
                if(b > max){
                    max = b;
                }
            }
        }
        return max;
    }
}
