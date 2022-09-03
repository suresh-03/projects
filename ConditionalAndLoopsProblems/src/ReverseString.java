import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter any word:");
		String in = input.nextLine();
		int len = in.length();
		int tempLen = len;

		while (tempLen != 0) {
			tempLen = tempLen - 1;
			char a = in.charAt(tempLen);
			System.out.print(a);
		}

	}

}
