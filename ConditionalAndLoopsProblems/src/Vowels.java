import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the word or sentence: ");
		String word = input.nextLine();

		int countV = 0;
		int countC = 0;

		int len = word.length();

		for (int i = 0; i <= (len - 1); i++) {
			char TempWord = word.charAt(i);

			if (TempWord == 'A' || TempWord == 'a') {
				System.out.println(TempWord + " is a vowel.");
				countV += 1;
			} else if (TempWord == 'E' || TempWord == 'e') {
				System.out.println(TempWord + " is a vowel.");
				countV += 1;
			} else if (TempWord == 'I' || TempWord == 'i') {
				System.out.println(TempWord + " is a vowel.");
				countV += 1;
			} else if (TempWord == 'O' || TempWord == 'o') {
				System.out.println(TempWord + " is a vowel.");
				countV += 1;
			} else if (TempWord == 'U' || TempWord == 'u') {
				System.out.println(TempWord + " is a vowel.");
				countV += 1;
			} else if (TempWord == ' ') {
				continue;
			} else {
				System.out.println(TempWord + " is a consonant.");
				countC += 1;
			}

		}

		System.out.println("\nYou Entered word has " + countV + " Vowels and " + countC + " Consonants.");
	}

}
