package BitwiseOperators;

// it is used if only one unique number is present in array

public class FindUniqueInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,6,9,1,4,2,3};
        System.out.println(find(arr));
    }
    public static int find(int[] arr){
        int ans = 0;

        for(int i : arr){
            ans ^= i;
        }
        return ans;
    }
}
