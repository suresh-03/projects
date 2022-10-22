import java.util.Scanner;

public class EnhancedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("enter the alphabets 'A' to 'D':");
		char input = in.next().charAt(0);
		
		switch(input) {
		case 'A' -> System.out.println("'A' for Apple.");
		case 'B' -> System.out.println("'B' for Ball.");
		case 'C' -> System.out.println("'C' for Cat.");
		case 'D' -> System.out.println("'D' for Dog.");
		default -> System.out.println("enter valid alphabet!");
		}
	}

}
