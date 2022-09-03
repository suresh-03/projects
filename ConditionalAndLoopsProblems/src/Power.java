import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double result = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to power it: ");
		int num = input.nextInt();
		System.out.print("Enter the exponent to power the number: ");
		int expo = input.nextInt();
		
		for(int i = 1; i <= expo; i++) {
			result *= num;
		}
		System.out.println(num + " power " + expo + " is: " + result);
	}

}
