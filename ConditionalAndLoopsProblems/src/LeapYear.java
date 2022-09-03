import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Year:");
		int year = input.nextInt();
		
		if(year % 100 == 0) {
			if(year % 400 == 0) {
				System.out.println(year + " is a leap year.");
			}
			else {
				System.out.println(year + " is not a leap year.");
			}
		}
		else if(year % 4 == 0) {
			System.out.println(year + " is a leap year.");
		}
		else {
			System.out.println(year + " is not a leap year.");
		}
	}

}
