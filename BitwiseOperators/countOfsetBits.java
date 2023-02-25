package BitwiseOperators;

public class countOfsetBits {
    public static void main(String[] args) {
        System.out.println(countSet(15));
    }
    static int countSet(int n){
        int temp = n;
        int count = 0;
        while(temp != 0){
            if((temp & 1) == 1){
                count++;
            }
            temp = temp >> 1;
        }
        return count;
    }
}
