package Recursion.basic;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(productOfdigits(1342));
    }
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return sum(n / 10)  + n % 10;
    }

    static int productOfdigits(int n){
        if(n == 0){
            return 1;
        }
        return productOfdigits(n / 10)  * (n % 10);
    }
}
