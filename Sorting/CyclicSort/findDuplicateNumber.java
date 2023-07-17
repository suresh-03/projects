package Sorting.CyclicSort;


public class findDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {5,7,9,2,1,3,4,6,8,10,5};
        System.out.println(find(arr));
    }
    public static int find(int[] arr){

        int i = 0;
        while(i < arr.length){
            if(i != arr[i] - 1 && arr[i] != arr[arr[i] - 1]){
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }

        for(int j = 0; j < arr.length; j++){
            if(j != arr[j] - 1){
                return arr[j];
            }
        }

        return -1;
        
    }
}
