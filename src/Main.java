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
		int number = 30;

		for (int n = 1; n <= number; n++) {
			if (n == 3 || containsDigit(n, 3)) {
				System.out.print("lucky ");
			} else if (n % 15 == 0) {
				System.out.print("fizzbuzz ");
			} else if (n % 3 == 0) {
				System.out.print("fizz ");
			} else if (n % 5 == 0) {
				System.out.print("buzz ");
			} else {
				System.out.print(n + " ");
			}
		}
	}
}
