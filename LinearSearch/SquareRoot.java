public class SquareRoot {
    public static void main(String[] args) {
        int x = 49;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {

        int i = 1;

        while (true) {
            int temp = i * i;
            if (temp == x) {
                return i;
            } else if (temp > x) {
                return i - 1;
            }
            i++;
        }

    }
}
