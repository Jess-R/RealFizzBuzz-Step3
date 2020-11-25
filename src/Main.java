import java.util.Scanner;

public class Main {

	public static boolean isMultipleOf15(int number) {
		return number % 15 == 0;
	}

	public static boolean isMultipleOf3(int number) {
		return number % 3 == 0;
	}

	public static boolean isMultipleOf5(int number) {
		return number % 5 == 0;
	}

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
			} else if (isMultipleOf15(n)) {
				System.out.print("fizzbuzz ");
				fizzBuzzCount += 1;
			} else if (isMultipleOf3(n)) {
				System.out.print("fizz ");
				fizzCount += 1;
			} else if (isMultipleOf5(n)) {
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
