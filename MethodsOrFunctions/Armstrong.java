import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the limit: ");
        int limit = in.nextInt();
        armstrongInRange(limit);
    }

    static void armstrongInRange(int limit) {
        int i;
        int result = 0;

        for (i = 1; i <= limit; i++) {
            if (i == 1) {
                System.out.println(i + " is armstrong number");
            } else if (i > 1 && i <= 9) {
                System.out.println(i + " is not armstrong number");
            } else {
                Integer temp = i;
                while (temp != 0) {
                    int a = temp % 10;
                    int b = a * a * a;
                    result += b;
                    temp = temp / 10;
                }
                if (result == i) {
                    System.out.println(i + " is armstrong number");
                    result = 0;
                } else {
                    System.out.println(i + " is not armstrong number");
                    result = 0;
                }
            }
        }
    }
}
