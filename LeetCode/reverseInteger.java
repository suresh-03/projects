public class reverseInteger {
    public static void main(String[] args) {
        int a = -321;
        System.out.println(reverse(a));
    }
    public static int reverse(int x) {
    if(x > 0){
        int temp = x;
        String s = Integer.toString(x);
        int len = s.length();
        double d = Math.pow(10,len - 1);
        int sum = 0;

        while(temp != 0){
            int t = temp % 10;
            sum += (d * t);
            temp /= 10;
            d /= 10;
        }
        if(sum > Math.pow(-2,31) && sum < (Math.pow(2,31)) - 1){
            return sum;
        }
        return 0;
    }
    int temp = x * -1;
    String s = Integer.toString(temp);
    int len = s.length();
    double d = Math.pow(10,len - 1);
    int sum = 0;

    while(temp != 0){
        int t = temp % 10;
        sum += (d * t);
        temp /= 10;
        d /= 10;
    }
    if(sum > Math.pow(-2,31) && sum < (Math.pow(2,31)) - 1){
        return sum * -1;
    }
    return 0;

    }
}
