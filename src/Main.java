import java.util.Scanner;

public class Main {

	public static void run(int number) {
		int fizzCount = 0;
		int buzzCount = 0;
		int fizzBuzzCount = 0;
		int luckyCount = 0;
		int unalteredCount = 0;

		for (int n = 1; n <= number; n++) {
			if (Integer.toString(n).contains("3")) {
				System.out.print("lucky ");
				luckyCount += 1;
			} else if (n % 15 == 0) {
				System.out.print("fizzbuzz ");
				fizzBuzzCount += 1;
			} else if (n % 3 == 0) {
				System.out.print("fizz ");
				fizzCount += 1;
			} else if (n % 5 == 0) {
				System.out.print("buzz ");
				buzzCount += 1;
			} else {
				System.out.print(n + " ");
				unalteredCount += 1;
			}
		}

		System.out.print("\nFizz: " + fizzCount);
		System.out.print("\nBuzz: " + buzzCount);
		System.out.print("\nFizzBuzz: " + fizzBuzzCount);
		System.out.print("\nLucky: " + luckyCount);
		System.out.print("\nInteger: " + unalteredCount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		do {
			System.out.print(("Assuming you start at 1, enter a whole number for a max range: "));
			while (!sc.hasNextInt()) {
				System.out.print("That is not a whole number. Try again: ");
				sc.next();
			}
			number = sc.nextInt();
		} while (number <= 0);

		run(number);
	}
}
