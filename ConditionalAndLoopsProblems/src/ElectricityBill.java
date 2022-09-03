import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			double amount = 0;
		
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter your previous reading: ");
			float pre_mon_reading = input.nextFloat();
			
			System.out.print("Enter your current month reading: ");
			float cur_mon_reading = input.nextFloat();
			
			float units = cur_mon_reading - pre_mon_reading;
			System.out.println("you are total units are:" + units);
			
			if(units <= 100) {
				
				System.out.println("no EB charge for units 0 to 100 for a month!");
				
			}
			else if(units <= 200) {
				
				amount = (units - 100) * 2.60;

			}
			else if(units <= 500) {
				
				amount = 130 + (units - 200) * 4.00;
			}
			else if(units > 500) {
				
				amount = 1330 + (units - 500) * 6.00;
			}
			
			System.out.println("your EB bill for this month is: RS." + amount + "/-");
	}

}
