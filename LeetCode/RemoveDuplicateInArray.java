import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {-3,-1,0,0,0,3,3};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
    public static int[] removeDuplicates(int[] nums) {
        int k = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = 0;
        }
        int[] arr = new int[set.size()];
      
            for(int i : set){
                arr[k] = i;
                k++;
            }
            for(int i = 0; i < arr.length; i++){
                for(int j = 1; j < arr.length; j++){
                    if(arr[j - 1] > arr[j]){
                        int temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            for(int i = 0; i < arr.length; i++){
                nums[i] = arr[i];
            }

            return nums;
         
        }


  
      
    }

