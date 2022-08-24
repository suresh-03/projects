import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.print("enter three digit number:");
			int in = input.nextInt();
		
		int c = 0;
		int a,d;
		int g,h,arm;
		
			c = in % 10;
			d = in / 10;
			g = d % 10;
			a = d / 10;
			h = g % 10;
			arm = (c*c*c) + (g*g*g) +(a*a*a);
//			System.out.println(c);
//			System.out.println(g);
//			System.out.println(a);
			if (arm == in) {
				System.out.println(in + " is a ARMSTRONG number!");
			}
			else {
				System.out.println(in + " is not a ARMSTRONG number!");
			}
			
		
		
		
			
	}

}
