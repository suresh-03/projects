package BitwiseOperators;

public class NthMagicNumber {
    public static void main(String[] args) {
        System.out.println(find(6));
    }
    static int find(int n){
        int ans = 0;
        int base = 5;

        while(n > 0){
            int bit = n & 1;
            ans += (bit * base);
            n = n >> 1;
            base *= 5;

        }
        return ans;
    }
}
