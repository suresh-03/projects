import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("enter the number:");
		int day = in.nextInt();

		switch (day) {
		case 1: {
			System.out.println("sunday!");
			break;
		}
		case 2: {
			System.out.println("monday!");
			break;
		}
		case 3: {
			System.out.println("tuesday!");
			break;
		}
		case 4: {
			System.out.println("wednesday!");
			break;
		}
		case 5: {
			System.out.println("thursday!");
			break;
		}
		case 6: {
			System.out.println("friday!");
			break;
		}
		case 7: {
			System.out.println("saturday!");
			break;
		}
		default: {
			System.out.println("enter valid number!");
			break;
		}

		}
	}

}
