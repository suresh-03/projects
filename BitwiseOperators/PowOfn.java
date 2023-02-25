package BitwiseOperators;

public class PowOfn {
    public static void main(String[] args) {
        System.out.println(power(3, 6));
    }
    static int power(int base, int pow){
        int tempPow = pow;
        int tempBase = base;
        int ans = 1;
        while(tempPow != 0){
            if((tempPow & 1) == 1){
                ans *= tempBase;
            }
            tempBase *= tempBase;
            tempPow = tempPow >> 1;
        }
      
        return ans;

    }
}
