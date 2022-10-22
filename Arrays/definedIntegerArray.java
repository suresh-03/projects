import java.util.Arrays;

public class definedIntegerArray {
    public static void main(String[] args) {
        //creating array object
        int[] numbers = new int[5];
        //we can also give syntax like
        //int[] numbers;
        //numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        //converting array to string for printing purpose
         System.out.println(Arrays.toString(numbers));

        //printing using for loop
        for(int i = 1; i <= numbers.length; i++){
            System.out.println(i);
        }

    }
}
