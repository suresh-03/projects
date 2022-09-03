import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number:");
		int a = input.nextInt();
		int d = a;
		int num1, num2 = 0;
		String num3 = "";
		String b = Integer.toString(a);
		int c = b.length();

		for (int i = 1; i <= c; i++) {
			num1 = d / 10;
			num2 = d % 10;
			d = num1;
			String num4 = Integer.toString(num2);
			num3 += num4;
		}

		if (num3.equals(b)) {
			System.out.println(b + " is a PALINDROME number!");
		} else {
			System.out.println(b + " is not a PALINDROME number!");
		}

	}

}
