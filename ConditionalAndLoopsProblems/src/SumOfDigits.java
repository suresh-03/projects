import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = input.nextInt();
		String Temp = Integer.toString(num);
		int len = Temp.length();
		
		for(int i = 1; i <= len; i++) {
			result += i;
		}
		System.out.println("The sum of " + Temp + " digits is " + result);
	}

}
