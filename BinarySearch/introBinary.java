package BinarySearch;

// binary search is only work on sorted arrays
// sorted arrays in either ascending order or descending order



public class introBinary {
    public static void main(String[] args) {
        int[] arrASC = {1,2,3,4,5,6,7};
        int[] arrDSC = {7,6,5,4,3,2,1};
        int target = 4;
        System.out.println(searchASC(target, arrASC));
        System.out.println(searchASC(target, arrDSC));
    }

    // this method is only for ascending order array
    static int searchASC(int target, int[] arr){
        int mid = arr.length / 2;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < arr[mid]){
                for(int j = 0; j < mid;j++){
                    if(arr[j] == target){
                        return j;
                    }
                }
            }
           else if(arr[i] > arr[mid]){
                for(int k = arr.length - 1; k > mid; k--){
                    if(arr[k] == target){
                        return k;
                    }
                }
            }
            else if(arr[mid] == target){
                return mid;
            }  
            }
            return -1;
        }

        // this method is only for descending order array
        static int searchDSC(int target, int[] arr){
            int mid = arr.length / 2;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > arr[mid]){
                    for(int j = 0; j < mid;j++){
                        if(arr[j] == target){
                            return j;
                        }
                    }
                }
               else if(arr[i] < arr[mid]){
                    for(int k = arr.length - 1; k > mid; k--){
                        if(arr[k] == target){
                            return k;
                        }
                    }
                }
                else if(arr[mid] == target){
                    return mid;
                }  
                }
                return -1;
            }
    }
    

