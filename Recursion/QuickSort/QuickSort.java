import java.util.Arrays;

public class QuickSort{
	public static void main(String[] args){
		int[] arr = {1,2,4,7,3,5,10,6,8,9,14,12,11,13};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int[] arr, int low,int high){
		
		int s = low;
		int e = high;

	

		int pivot = (s+e)/2;

		if(low >= high){
			return;
		}
		

		while(s <= e){
			
			while(arr[s] < arr[pivot]){
				s++;
			}
			while(arr[e] > arr[pivot]){
				e--;
			}
			if(s<=e){
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e--;
			}

		}

		quickSort(arr,low,e);
		quickSort(arr,s,high);
	}
}