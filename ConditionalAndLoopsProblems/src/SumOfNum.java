import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers: or \nWant to quit press '0':");

		while (true) {
			int num = input.nextInt();
			sum += num;

			if (num == 0) {
				break;
			}
		}
		System.out.println("The sum of given numbers is: " + sum);
	}

}
