package Sorting.CyclicSort;

public class findFirstPositiveMissNumber {

    public static void main(String[] args) {
        int[] arr = {5,4,8,9,1,2,-3,-6};
        System.out.println(find(arr));
    }
    public static int find(int[] arr){
        int i = 0;
        while(i < arr.length){
            
            if(arr[i] > 0 && (arr[i] - 1) < arr.length && i != arr[i] - 1 && arr[i] != arr[arr[i] - 1]){
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }

        if(arr[0] != 1){
            return 1;
        }

        for(int j = 0; j < arr.length; j++){
            if(j != arr[j] - 1){
                return arr[j - 1] + 1;
            }
        }

        return arr[arr.length - 1] + 1;
    }
}

