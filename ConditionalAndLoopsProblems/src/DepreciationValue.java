import java.util.Scanner;

public class DepreciationValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the total cost of the asset: ");
		int cost = input.nextInt();
		System.out.print("Enter the Estimated Salvage value: ");
		int value = input.nextInt();
		System.out.print("Enter the useful life of the asset: ");
		int year = input.nextInt();
		
		int Depreciation = (cost - value) / year;
		
		System.out.println("the Depreciation value is " + Depreciation + " for annually for " + year + " years.");
		
	}

}
