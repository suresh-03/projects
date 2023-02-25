package BitwiseOperators;

public class FindithBit {
    public static void main(String[] args) {
        System.out.println(find(12,4));
    }
    static int find(int n, int i){

        return (n & (1 << (i - 1))) >> (i - 1);
    }
}
