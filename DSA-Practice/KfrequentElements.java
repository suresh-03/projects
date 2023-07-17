
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sound.sampled.AudioFileFormat.Type;


public class KfrequentElements {
    public static void main(String[] args) {
        int[] arr = {4,1,-1,2,-1,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(arr, k)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
     HashMap<Integer,Integer> map = new HashMap<>();
     int arr[] = new int[k];
     Arrays.sort(nums);
     int index = 0;
     for(int i = 0; i < nums.length; i++){
        int count = 1;
        for(int j = i+1; j < nums.length; j++){
            if(nums[i] == nums[j]){
                count++;
                index = j;
            }
        }
        if(count > 1){
            i = index;
            map.put(nums[index], count);
        }
        else{
            map.put(nums[i],count);
        } 
     }
     
     List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
     entryList.sort(Map.Entry.comparingByValue());

     int j = 0;

     for(int i = entryList.size()-1; i >= entryList.size()-k; i--){
        arr[j] = entryList.get(i).getKey();
        j++;
     }

     System.out.println(entryList);

     return arr;
} 
}
