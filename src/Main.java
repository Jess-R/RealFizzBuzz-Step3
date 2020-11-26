import java.util.Scanner;

public class Main {
	public static int luckyCount = 0;
	public static int fizzBuzzCount = 0;
	public static int fizzCount = 0;
	public static int buzzCount = 0;
	public static int unalteredCount = 0;
	public static int maxNumber;

	public static int getMaxNumberFromUser() {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print(("Assuming you start at 1, enter a whole number for a max range: "));
			while (!sc.hasNextInt()) {
				System.out.print("That is not a whole number. Try again: ");
				sc.next();
			}
			maxNumber = sc.nextInt();
		} while (maxNumber <= 0);

		return maxNumber;
	}

	public static String run(int maxNumber) {
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

		StringBuilder sb = new StringBuilder();
		sb.append("\nFizz: ").append(fizzCount);
		sb.append("\nBuzz: ").append(buzzCount);
		sb.append("\nBuzz: ").append(fizzBuzzCount);
		sb.append("\nLucky: ").append(luckyCount);
		sb.append("\nInteger: ").append(unalteredCount);

		System.out.print("\nFizz: " + fizzCount);
		System.out.print("\nBuzz: " + buzzCount);
		System.out.print("\nFizzBuzz: " + fizzBuzzCount);
		System.out.print("\nLucky: " + luckyCount);
		System.out.print("\nInteger: " + unalteredCount);

		return sb.toString();
	}

	public static boolean isMultipleOf15(int number) {
		return number % 15 == 0;
	}

	public static boolean isMultipleOf3(int number) {
		return number % 3 == 0;
	}

	public static boolean isMultipleOf5(int number) {
		return number % 5 == 0;
	}

	public static String incrementCounter(String name) {
		StringBuilder sb = new StringBuilder();

		switch (name) {
			case "lucky" -> {
				sb.append("lucky ");
				luckyCount += 1;
			}
			case "fizzBuzz" -> {
				sb.append("fizzbuzz ");
				fizzBuzzCount += 1;
			}
			case "fizz" -> {
				sb.append("fizz ");
				fizzCount += 1;
			}
			case "buzz" -> {
				sb.append("buzz ");
				buzzCount += 1;
			}
			case "unaltered" -> unalteredCount += 1;
		}

		System.out.print(sb);
		return sb.toString();
	}

	public static void main(String[] args) {
		// call run() with the value returned from getUserInput()
		run(getMaxNumberFromUser());
	}
}
