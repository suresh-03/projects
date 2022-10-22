import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter the number between 1 to 5:");
		int num = in.nextInt();
		System.out.print("enter your name:");
		String name = in.next();

		switch (num) {
		case 1 -> System.out.println("you are good.");
		case 2 -> System.out.println("you are bad.");
		case 3 -> {
			switch (name) {
			case "suresh" -> System.out.println("you will became billionaire.");
			case "sathish" -> System.out.println("you will became game developer.");
			default -> System.out.println("this is only for suresh and sathish!");
			}
		}
		case 4 -> System.out.println("you are ok.");
		case 5 -> System.out.println("you are ugly.");
		default -> System.out.println("enter the number between 1 to 5!");
		}

	}
}
