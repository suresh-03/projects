import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class GroupAnagram{
	public static void main(String args[]){
		String[] arr = {"mal","lam","tam","mat","neem","meen","dove","pani"};
		System.out.println(groupAnagrams(arr));
	}
 	public static List<List<String>> groupAnagrams(String[] strs) {
		ArrayList<String> ans = new ArrayList<>();
		for(int i = 0; i < strs.length; i++){
			ans.add(strs[i]);
		}
       List<List<String>> group = new ArrayList<List<String>>();
		ArrayList<String> arr1 = new ArrayList<>();
		for(int i = 0; i < strs.length; i++){
			int[] temp = new int[strs[i].length()];
			String s1 = "";
			for(int j = 0; j < strs[i].length(); j++){
				temp[j] = (int)strs[i].charAt(j);
			}
			for(int k = 0; k < temp.length; k++){
				for(int l = k+1; l < temp.length; l++){
					if(temp[l] < temp[k]){
						int t = temp[k];
						temp[k] = temp[l];
						temp[l] = t;
					}
				}
			}

			for(int m = 0; m < temp.length; m++){
				s1 += (char)temp[m];
			}
			arr1.add(s1);
		}


		for(int i = 0; i < arr1.size(); i++){
			List<String> list = new ArrayList<>();
			boolean match = false;
			for(int j = i+1; j < arr1.size(); j++){
				if(arr1.get(i).equals(arr1.get(j))){
					match = true;
					list.add(ans.get(j));
					ans.remove(j);
					arr1.remove(j);
					j--;
				}
			}
			if(match){
				list.add(ans.get(i));
				ans.remove(i);
				arr1.remove(i);
				i--;
			}
			else{
				list.add(ans.get(i));
			}

			group.add(list);
		}
		
	   return group;
    }
}