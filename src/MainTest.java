import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
	private final Main tester = new Main();
	private final int number1 = 43;
	private final int number2 = 15;

	@Test
	public void testIsMultipleOf15() {
		boolean result1 = Main.isMultipleOf15(number1);
		boolean result2 = Main.isMultipleOf15(number2);

		assertFalse(result1);
		assertTrue(result2);
	}

	@Test
	public void testIsMultipleOf3() {
		boolean result1 = Main.isMultipleOf3(number1);
		boolean result2 = Main.isMultipleOf3(number2);

		assertFalse(result1);
		assertTrue(result2);
	}

	@Test
	public void testIsMultipleOf5() {
		boolean result1 = Main.isMultipleOf5(number1);
		boolean result2 = Main.isMultipleOf5(number2);

		assertFalse(result1);
		assertTrue(result2);
	}

	@Test
	public void testIncrementCounter() {
		// test initial values
		assertEquals(0, tester.luckyCount);
		assertEquals(0, tester.fizzBuzzCount);
		assertEquals(0, tester.fizzCount);
		assertEquals(0, tester.buzzCount);
		assertEquals(0, tester.unalteredCount);

		// increment value for each counter
		tester.incrementCounter("lucky");
		tester.incrementCounter("fizzBuzz");
		tester.incrementCounter("fizz");
		tester.incrementCounter("buzz");
		tester.incrementCounter("unaltered");

		// test values after incrementing
		assertEquals(1, tester.luckyCount);
		assertEquals(1, tester.fizzBuzzCount);
		assertEquals(1, tester.fizzCount);
		assertEquals(1, tester.buzzCount);
		assertEquals(1, tester.unalteredCount);
	}
}