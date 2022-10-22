import java.lang.reflect.Array;
import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        VarArg(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    static void VarArg(int... nums) {
        System.out.println(Arrays.toString(nums));// for the
        // original value to print we have to convert the array
        // to string.
    }
}
