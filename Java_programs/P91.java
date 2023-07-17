import java.util.*;

public class P91 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp = num;
        ArrayList<Integer> arr = new ArrayList<>(3);

        while (temp != 0) {
            int num1 = temp % 10;
            arr.add(num1);
            temp /= 10;
        }
        int size = arr.size() - 1;

        for (int i = size; i >= 0; i--) {
            switch (arr.get(i)) {
                case 0: {
                    System.out.print("Zero" + " ");
                    break;
                }
                case 1: {
                    System.out.print("One" + " ");
                    break;
                }
                case 2: {
                    System.out.print("Two" + " ");
                    break;
                }
                case 3: {
                    System.out.print("Three" + " ");
                    break;
                }
                case 4: {
                    System.out.print("Four" + " ");
                    break;
                }
                case 5: {
                    System.out.print("Five" + " ");
                    break;
                }
                case 6: {
                    System.out.print("Six" + " ");
                    break;
                }
                case 7: {
                    System.out.print("Seven" + " ");
                    break;
                }
                case 8: {
                    System.out.print("Eight" + " ");
                    break;
                }
                case 9: {
                    System.out.print("Nine" + " ");
                    break;
                }
            }
        }

        in.close();
    }
}
