import java.util.Scanner;

public class Main {
	static int luckyCount = 0;
	static int fizzBuzzCount = 0;
	static int fizzCount = 0;
	static int buzzCount = 0;
	static int unalteredCount = 0;

	public static boolean isMultipleOf15(int number) {
		return number % 15 == 0;
	}

	public static boolean isMultipleOf3(int number) {
		return number % 3 == 0;
	}

	public static boolean isMultipleOf5(int number) {
		return number % 5 == 0;
	}

	public static void incrementCounter(String name) {
		switch (name) {
			case "lucky" -> {
				System.out.print("lucky ");
				luckyCount += 1;
			}
			case "fizzBuzz" -> {
				System.out.print("fizzbuzz ");
				fizzBuzzCount += 1;
			}
			case "fizz" -> {
				System.out.print("fizz ");
				fizzCount += 1;
			}
			case "buzz" -> {
				System.out.print("buzz ");
				buzzCount += 1;
			}
			case "unaltered" -> unalteredCount += 1;
		}
	}

	public static void run(int maxNumber) {
		for (int currentNumber = 1; currentNumber <= maxNumber; currentNumber++) {
			if (Integer.toString(currentNumber).contains("3")) {
				incrementCounter("lucky");
			} else if (isMultipleOf15(currentNumber)) {
				incrementCounter("fizzBuzz");
			} else if (isMultipleOf3(currentNumber)) {
				incrementCounter("fizz");
			} else if (isMultipleOf5(currentNumber)) {
				incrementCounter("buzz");
			} else {
				System.out.print(currentNumber + " ");
				incrementCounter("unaltered");
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
		int maxNumber;

		do {
			System.out.print(("Assuming you start at 1, enter a whole number for a max range: "));
			while (!sc.hasNextInt()) {
				System.out.print("That is not a whole number. Try again: ");
				sc.next();
			}
			maxNumber = sc.nextInt();
		} while (maxNumber <= 0);

		run(maxNumber);
	}
}
