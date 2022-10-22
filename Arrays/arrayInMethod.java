import java.util.Arrays;

public class arrayInMethod {
    public static void main(String[] args) {
        int[] array = new int[3];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        System.out.println(Arrays.toString(array));

        //array is passed now value in index 0 is changed
        change(array);

        System.out.println(Arrays.toString(array));
    }
    static void change(int[] nums){
        //changing the value in index 0
        nums[0] = 3;
    }
}
