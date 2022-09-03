import java.util.Scanner;

// calculating the distance between two points

public class DistanceBet2Points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 0, x2 = 0;
		int y1 = 0, y2 = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter source point axis:");
		
		for(int i = 1; i <= 2; i++) {
			if(i == 1) {
				System.out.print("Enter X1:");
				int X_AXIS = input.nextInt();
				x1 = X_AXIS;
			}
			else {
				System.out.print("Enter Y1:");
				int Y_AXIS = input.nextInt();
				y1 = Y_AXIS;
			}
		}
		
		System.out.println("Enter the destination point axis:");
		
		for(int i = 1; i <= 2; i++) {
			if(i == 1) {
				System.out.print("Enter X2:");
				int X_AXIS = input.nextInt();
				x2 = X_AXIS;
			}
			else {
				System.out.print("Enter Y2:");
				int Y_AXIS = input.nextInt();
				y2 = Y_AXIS;
			}
		}
		
		int Xaxis = (int) Math.pow((x2 - x1),2);
		int Yaxis = (int) Math.pow((y2 - y1),2);
		
		int sum = Xaxis + Yaxis;
		
		double distance =  Math.sqrt(sum);
		
		System.out.println("The distance between given two points is " + distance);
	}

}
