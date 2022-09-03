import java.util.Scanner;

public class BattingAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float average = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter total matches you are played: ");
		int matches = input.nextInt();
		System.out.print("Enter total runs you have scored: ");
		int runs = input.nextInt();
		
		average = (float)(runs) / (float)(matches);
		
		System.out.println("The average of the batsman is " + average);
	}

}
