import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		int temp = num;
		int i = 0;
		int a = 0;

		while (temp != 0) {
			a = temp % 10;
			a = a * a * a;
			i += a;
			temp = temp / 10;
		}

		if (i == num) {
			System.out.println(num + " is a armstrong number!");
		} else {
			System.out.println(num + " is not a armstrong number!");
		}

	}

}
