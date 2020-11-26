import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
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
		assertEquals(0, Main.luckyCount);
		assertEquals(0, Main.fizzBuzzCount);
		assertEquals(0, Main.fizzCount);
		assertEquals(0, Main.buzzCount);
		assertEquals(0, Main.unalteredCount);

		// increment value for each counter
		Main.incrementCounter("lucky");
		Main.incrementCounter("fizzBuzz");
		Main.incrementCounter("fizz");
		Main.incrementCounter("buzz");
		Main.incrementCounter("unaltered");

		// test values after incrementing
		assertEquals(1, Main.luckyCount);
		assertEquals(1, Main.fizzBuzzCount);
		assertEquals(1, Main.fizzCount);
		assertEquals(1, Main.buzzCount);
		assertEquals(1, Main.unalteredCount);

		// test console output:

	}

//	@Test
//	public void testGetMaxNumberFromUser() throws UnsupportedEncodingException {
//		String validInput = "20";
//		ByteArrayInputStream input = new ByteArrayInputStream(validInput.getBytes());
//		System.setIn(input);
//		int maxNumber = Integer.parseInt(validInput);
//
//		assertEquals(maxNumber, Main.getMaxNumberFromUser());
//
//		String invalidInput = "abc";
//		ByteArrayInputStream input2 = new ByteArrayInputStream(invalidInput.getBytes());
//		System.setIn(input2);
//		ByteArrayOutputStream output = new ByteArrayOutputStream();
//		PrintStream newOut = new PrintStream(output);
//		System.setOut(newOut);
//
//		assertTrue(new String(output.toByteArray()).contains("That is not a whole number. Try again: "));
//
//	}
//
	@Test
	public void testRun() {
		int maxNumber = 20;
		var results = Main.run(maxNumber);

		StringBuilder expectedSb = new StringBuilder();
		expectedSb.append("\nFizz: ").append(Main.fizzCount);
		expectedSb.append("\nBuzz: ").append(Main.buzzCount);
		expectedSb.append("\nBuzz: ").append(Main.fizzBuzzCount);
		expectedSb.append("\nLucky: ").append(Main.luckyCount);
		expectedSb.append("\nInteger: ").append(Main.unalteredCount);

		assertEquals(expectedSb.toString(), results);
	}
}