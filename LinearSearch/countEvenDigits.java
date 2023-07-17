package LinearSearch;

public class countEvenDigits {
    public static void main(String[] args) {
        int[] arr = {12,3456,234,1};
        System.out.println(count(arr));
        System.out.println(num(arr));
        System.out.println(optimize(-523523));
    }
 
    static int count(int[] arr){
         int ans = 0;
       
        for(int i : arr){
            int sum = 0;
            int temp = i;
            while(temp != 0){
                sum += 1;
                temp /= 10;
            }
            if(sum % 2 == 0){
                ans++;
            }
        }
        return ans;
    }

    // method 2
    static int num(int[] arr){
        int count = 0;
        for(int i : arr){
           if( even(i)){
            count++;
           }
        }
        return count;
    }

    static boolean even(int a){
        int noOfDigits = digits(a);

        return noOfDigits % 2 == 0;
    }

    static int digits(int b){
        int count = 0;
        while(b != 0){
            count++;
            b /= 10;
        }
        return count;
    }

    // method 3

    static int optimize(int a){

        if(a < 0){
            a = a * -1;
        }

        return (int) Math.log10(a) + 1;  // to find digits of number.
    }
}
