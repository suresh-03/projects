import java.util.Scanner;

public class commissionPercent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the sell price of the house:");
		int salePrice = input.nextInt();
		System.out.print("Enter the commission percentage:");
		int commissionPerc = input.nextInt();
		
		float commissionPrice = (float)(salePrice * commissionPerc) / 100;
		
		System.out.println("your commission price is RS." + commissionPrice + "/-");
		
		
	}

}
