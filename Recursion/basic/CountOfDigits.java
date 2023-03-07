package Recursion.basic;

public class CountOfDigits {
    public static void main(String[] args) {
       System.out.println(count(1));
    }
    static int count(int n){
        if(n == 0){
            return 0;
        }
        return count(n / 10) + 1;
    }
}
