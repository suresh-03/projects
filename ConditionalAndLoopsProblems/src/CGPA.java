import java.util.Scanner;

public class CGPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 0;
		int totCredit = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of subjects:");

		int subjects = input.nextInt();

		for (int i = 1; i <= subjects; i++) {
			System.out.print("Enter the subject name with code: ");
			String subName = input.next();
			System.out.println("Enter the subject ( " + subName + " ) credit: ");
			int credit = input.nextInt();

			int TempCredit = credit;
			totCredit += TempCredit;

			System.out.println("Enter your Grade in the subject ( " + subName + " ): ");
			String grade = input.next();
			String TempGrade = grade;
			TempGrade = TempGrade.toUpperCase();

			if (TempGrade.equals("O")) {
				int mul = (10 * TempCredit);
				total += mul;
			} else if (TempGrade.equals("A+")) {
				int mul = (9 * TempCredit);
				total += mul;
			} else if (TempGrade.equals("A")) {
				int mul = (8 * TempCredit);
				total += mul;
			} else if (TempGrade.equals("B+")) {
				int mul = (7 * TempCredit);
				total += mul;
			} else if (TempGrade.equals("B")) {
				int mul = (6 * TempCredit);
				total += mul;
			}
		}
		float GPA = (float)total / (float)totCredit;

		System.out.println("your GPA is : " + GPA);
	}

}
