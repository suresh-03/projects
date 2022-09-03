import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first = input.nextInt();
		System.out.print("Enter second number: ");
		int second = input.nextInt();

		int tempFirst = first;
		int tempSecond = second;

		int commonF = 0;
		int commonS = 0;
		
		int a = 1;
		int b = 1;

		int i = 2;
		int j = 2;

		while (true) {

			if (tempFirst >= tempSecond) {
				int temp = tempFirst % i;
				if (temp == 0) {
					commonF = i;
					System.out.println(a + ". common factor of " +first+ " is: " + commonF);
					tempFirst /= i;
					i = 2;
					a++;

				} else {
					i += 1;
				}
			} else if (tempSecond > tempFirst) {
				int temp = tempSecond % j;
				if (temp == 0) {
					commonS = j;
					System.out.println(b + ". common factor of " +second+ " is: " + commonS);
					tempSecond /= j;
					j = 2;
					b++;

				} else {
					j += 1;
				}
			}

			if (tempFirst == 1 && tempSecond == 1) {
				break;
			}

		}
		
		}
	}

