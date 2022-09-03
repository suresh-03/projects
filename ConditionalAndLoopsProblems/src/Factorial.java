
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.print("Enter one number:");
			int num = input.nextInt();
			long a = 1L;
			
			for(int i = 1; i < (num+1); i++) {
					a = i * a;
	
			 }
			System.out.println(a);
			}
	}


