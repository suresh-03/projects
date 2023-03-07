package BitwiseOperators;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(powOf2(9));
    }
    static boolean powOf2(int n){
        boolean ans = ((n & (n - 1))) == 0;
        return ans;
    }
}
