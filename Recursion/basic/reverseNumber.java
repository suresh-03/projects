package Recursion.basic;

public class reverseNumber {
    public static void main(String[] args) {
      System.out.println(reverse2(1234321));
      System.out.println(palindrome(1234321));
    }
    static int sum = 0;
    static void reverse(int n){
        if(n == 0){
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;

        reverse(n / 10);
    }

    // method 2

    static int reverse2(int n){
        int digits = (int)Math.log10(n) + 1;
        return reverse2Help(n, digits);
    }

    static int reverse2Help(int n, int base){
        if(n == 0){
            return 0;
        }

        return (n % 10) * (int)(Math.pow(10,base - 1)) + reverse2Help(n / 10, base - 1);
    }

    // for palindrome check
    static boolean palindrome(int n){
        return n == reverse2(n);
    }
}
