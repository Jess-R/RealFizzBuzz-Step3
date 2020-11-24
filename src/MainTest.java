import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

	@Test
	public void testContainsDigit() {
		Main tester = new Main();
		int number1 = 30;
		int number2 = 15;
		int digit = 3;

		assertTrue(tester.containsDigit(number1, digit));
		assertFalse(tester.containsDigit(number2, digit));
	}

	@Test
	public void main() {
	}
}