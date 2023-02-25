package java_basics;

public class binaryToDecimal {
    public static void main(String[] args) {
        int a = 1000100011;
        int sum = 0;
        int d = 2;

       int temp = a;

       int b = temp % 10;
       sum += b * 1;

       temp /= 10;

       while(temp != 0){
        int c = temp % 10;
        sum += (c * d);
        temp /= 10;
        d += d;
       }

       System.out.println(sum);

    }
}
