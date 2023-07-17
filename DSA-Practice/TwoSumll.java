import java.util.Arrays;

public class TwoSumll {
public static void main(String[] args) {
    int[] arr = {2,7,11,15};
    System.out.println(Arrays.toString(binarySearch(arr, 9)));
}
public static int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i]+numbers[j] == target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
}
public static int[] binarySearch(int[] numbers,int target){
    int s = 0,e=numbers.length-1;
    while(s<e){
        int n1 = numbers[s];
        int n2 = numbers[e];
        if(n1+n2 == target){
            break;
        }
        else if(n1+n2 > target){
            e--;
        }
        else{
            s++;
        }
    }
    return new int[]{s+1,e+1};
}
}
