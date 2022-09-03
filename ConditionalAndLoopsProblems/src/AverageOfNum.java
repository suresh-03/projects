import java.util.Scanner;

public class AverageOfNum {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int total = 0;
		float average = 0f;
		Scanner input = new Scanner(System.in);
		int count = 1;
		average = total / count;

		System.out.println("Enter some numbers \nI will find average of those numbers:");
		System.out.println("if you want to quit press '0'!");

		while (true) {

			int num = input.nextInt();
			if (num == 0) {
				break;
			}
			total += num;
			count++;

		}
		average = total / (count - 1);

		System.out.println("the avreage of given numbers is " + average);

	}

}
