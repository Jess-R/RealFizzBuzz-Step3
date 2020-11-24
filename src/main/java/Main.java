public class Main {

	public static boolean containsDigit(int num, int digit) {
		while (num > 0) {
			if (num % 10 == 3) {
				System.out.print("lucky");
				return true;
			}
			num = num / 10;
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


