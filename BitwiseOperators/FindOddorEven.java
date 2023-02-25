package BitwiseOperators;

public class FindOddorEven {
    public static void main(String[] args) {
        System.out.println(find(8));
    }
    public static String find(int n){
        if((n & 1) == 1){
            return "odd";
        }
        else{
            return "even";
        }
    }
}
