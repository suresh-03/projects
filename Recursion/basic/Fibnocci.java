package basic;



public class Fibnocci {
    public static void main(String[] args) {
        int ans = fiboFormula(1);
        System.out.println(ans);
    }

    static int fiboFormula(int n){
       return (int)(Math.pow(((1 + Math.sqrt(5))/2),n) / Math.sqrt(5));
    }

    static int fib(int n){
     if(n < 2){
        return n;
     }
     return fib(n - 1) + fib(n - 2);
    }
}
