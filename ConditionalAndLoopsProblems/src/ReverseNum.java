import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = input.nextInt();
		int temp = num;

		int ans = 0;
		int n;

		while (temp != 0) {
			n = temp % 10;
			temp /= 10;

			ans = (ans * 10) + n;
		}

		System.out.print(ans);

	}

}
