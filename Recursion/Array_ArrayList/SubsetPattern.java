package Array_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetPattern {

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(subsetsWithDup(arr));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subset2(temp,ans,0,nums);
        return ans;

    }

    public static void subset2(List<Integer> temp,List<List<Integer>> list,int ind,int[] nums){
        ArrayList<Integer> temp1 = new ArrayList<>(temp);
        if(ind >= nums.length){
            list.add(temp1);
            return;
        }

      

        temp1.add(nums[ind]);
        subset2(temp1,list,ind+1,nums);

        temp1.remove(temp1.size()-1);
        subset2(temp1,list,ind+1,nums);

    }
}
