package BinarySearch;

class FindLetter2 {

    public static void main(String[] args) {
        char[] arr = {'x','x','y','y'};
        char target = 'z';
        FindLetter2 v = new FindLetter2();
        System.out.println(v.nextGreatestLetter(arr, target));
    }

    public char nextGreatestLetter(char[] letters, char target) {
              int start = 0, end = letters.length-1; 
        
        while(start<=end){
            int mid = start + (end - start)/2;
            if(letters[mid]>target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        
        return letters[start % letters.length];
    }
}
