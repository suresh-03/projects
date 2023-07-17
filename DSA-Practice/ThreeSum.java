import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {1,-1,-1,0,2,-4};
        System.out.println(threeSum2(arr));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<String> used = new HashSet<>();
        Arrays.sort(nums);
        // if(nums.length == 0){
        //     return ans;
        // }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
        }
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                int sum = nums[i] + nums[j];
                if(map.containsKey(-1*sum)){
                    int k = map.get(-1*sum);
                    if(!used.contains(nums[i]+":"+nums[j]+":"+nums[k]) && k > i && k > j){
                        used.add(nums[i]+":"+nums[j]+":"+nums[k]);
                        ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        return ans;
    }
    // another method
    public static List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int s = i+1;
            int e = nums.length-1;
            while(s<e){
                if(nums[i]+nums[s]+nums[e] == 0){
                    set.add(Arrays.asList(nums[i],nums[s],nums[e]));
                    s++;
                    e--;
                }
                else if(nums[i]+nums[s]+nums[e] < 0){
                    s++;
                }
                else{
                    e--;
                }
            }
        }
        ans.addAll(set);
        return ans;
    }
}

