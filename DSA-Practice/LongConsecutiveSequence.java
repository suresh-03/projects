import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LongConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
       
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
 
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        for(Integer n : set){
            list.add(n);
        }
        int[] temp = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            temp[i] = list.get(i);
        }
        Arrays.sort(temp);
        int count = 1;
        int max = count;
        for(int i = 0; i < temp.length-1; i++){
              boolean same = false;
                if(temp[i]+1 == temp[i+1]){
                    same = true;
                    count++;
                }
            if(!same){
                if(count > max){
                    max = count;
                }
                count = 1;
            }
        }
        if(count > max){
            max = count;
        }
        return max;
    }
}
