import java.util.Scanner;

public class PalindromeTriangle {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("enter the limit:");
			int limit = in.nextInt();
			
			int temp = 0;
		
			for(int i = 1; i <= limit; i++) {
			
				for(int j = 1; j <= i; j++) {
					System.out.print(j);
					temp = j;
				}
				if(i != 1) {
				while(temp != 1) {
					temp = temp - 1;
					System.out.print(temp);
				}
				}
				System.out.println();	
			}
		}
}
