package BitwiseOperators;

public class resetIthBit {
    public static void main(String[] args) {
        System.out.println(reset(15, 1));
    }
    static int reset(int n, int i){
        return (n &(~(1 << (i - 1))));
    }
}
