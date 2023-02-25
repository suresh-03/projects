public class CountOddNumbers {
    public static void main(String[] args) {
        System.out.println(countOdd(9,11 ));
    }
    public static int countOdd(int low,int high){
    
       if((low & 1) == 0){
        low++;
       }

       return low > high ? 0 : (high - low) / 2 + 1;
    }
}
