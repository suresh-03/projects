import java.util.Scanner;

// Discount calculator 

public class DiscountCalci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of the product: ");
		float price = input.nextInt();
		System.out.print("Enter the product discount in %: ");
		float discount = input.nextInt();
		
		float floatDiscount = discount / 100;
		float oriPrice = floatDiscount * price;
		float productPrice = (price - oriPrice);
		
		System.out.println("The product price after the reduction of discount is: " + productPrice);
		
		
	}

}
