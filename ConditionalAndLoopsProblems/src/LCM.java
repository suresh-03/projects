import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int LCMFirst = 0;
		int LCMSecond = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first = input.nextInt();
		System.out.print("Enter second number: ");
		int second = input.nextInt();
		LCMFirst = first;
		LCMSecond = second;

		while (true) {
			if (LCMFirst > LCMSecond) {
				LCMSecond += second;
				if (LCMFirst == LCMSecond) {
					System.out.println("The LCM of " + first + " and " + second + " is : " + LCMFirst);
					break;
				}
			} else if (LCMSecond > LCMFirst) {
				LCMFirst += first;
				if (LCMFirst == LCMSecond) {
					System.out.println("The LCM of " + first + " and " + second + " is : " + LCMFirst);
					break;
				}
			} else {
				System.out.println("The LCM of " + first + " and " + second + " is : " + LCMFirst);
				break;
			}
		}

	}

}
