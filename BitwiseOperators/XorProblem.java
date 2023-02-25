package BitwiseOperators;

public class XorProblem {
    public static void main(String[] args) {
        System.out.println(xor(6));
    }
    static int xor(int n){
        if(n % 4 == 0){
            return n;
        }
        if(n % 4 == 1){
            return 1;
        }
        if(n % 4 == 2){
            return (n + 1);
        }
      return 0;
    }
}
