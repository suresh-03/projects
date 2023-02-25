package Maths;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(lcm(4, 20));
    }
    // gcd - euclidean algorithm = gcd(reminder(a,b),a);
    static int gcd(int a, int b){
        return a == 0 ? b : gcd(b%a,a);
    }
    // lcm - (ab)/gcd(a,b)
    static int lcm(int a, int b){
        return a * b / gcd(a,b);
    }
}
