package BitwiseOperators;

public class digitsOfNumber {
    public static void main(String[] args) {
        System.out.println(digitsLog(5431,16));
      
    }
    static int digits(int n){
        int count = 0;
        while(n > 0){
            n = n >> 1;
            count++;
        }
        return count;
    }

    static int digitsLog(int n, int b){
        return (int)((Math.log(n) / Math.log(b)) + 1);
    }

    
}
