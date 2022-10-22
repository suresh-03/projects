import java.util.Arrays;
import java.util.Scanner;

public class inputIntegerArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("enter the numbers:");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

            System.out.println(Arrays.toString(numbers));
        
    }
}
