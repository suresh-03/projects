package BinarySearch;

/*

You are given an array of characters letters that is sorted in non-decreasing order, and a character target. 
There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. 
If such a character does not exist, return the first character in letters.

example:-

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

*/ 

public class FindLetter {
    public static void main(String[] args) {
        char[] arr = {'x','x','y','y'};
        char target = 'x';
        System.out.println(findLetter(arr, target));
    }
    public static char findLetter(char[] arr, char target){

        int[] num = new int[arr.length];
        int t = (int)target;

        for(int i = 0; i < arr.length; i++){
            num[i] = (int)arr[i];
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == target){
                return arr[mid + 1];
            }

            if(t == num[mid]){
                return arr[mid + 1];
            }

            if(t > num[num.length - 1]){
                return arr[0];
            }

            if(t > num[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return arr[start % arr.length];

    }
}
