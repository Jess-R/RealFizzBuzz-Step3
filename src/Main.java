import java.util.Scanner;

public class Main {
	public static boolean containsDigit(int number, int digit) {
		while (number > 0) {
			if (number % 10 == digit) {
				return true;
			}
			number = number / 10;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(("Assuming you start at 1, enter an integer for a max range: "));
		int number = sc.nextInt();

		int fizzCount = 0;
		int buzzCount = 0;
		int fizzBuzzCount = 0;
		int luckyCount = 0;
		int unalteredCount = 0;

		for (int n = 1; n <= number; n++) {
			if (n == 3 || containsDigit(n, 3)) {
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
}
