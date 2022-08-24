import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in); 
				System.out.print("enter first number:");
				int a = input.nextInt();
				if(a % 2 == 0) {
					System.out.println(a + " is a EVEN number! ");
				}
				else {
					System.out.println(a +" is a ODD number!");
				}
			}
	
	}


