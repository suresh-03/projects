import java.util.Scanner;

public class LargeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.print("enter 1st number:");
			int a = input.nextInt();
			System.out.print("enter 2nd number:");
			int b = input.nextInt();
			
			if(a > b) {
				System.out.println("a = "+a+" is a big number when compared to b = " + b);
			}
			else if(a == b) {
				System.out.println("a and b are same value! which is " + a);
			}
			else {
				System.out.println("b = "+b+"is big number when compared to a = " + a);
			}
			
	}

}
