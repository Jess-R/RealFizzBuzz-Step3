import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
	private final Main tester = new Main();
	private final int number1 = 43;
	private final int number2 = 15;

	@Test
	public void testRun() {

	}

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

//	@Test
//	public void testIncrementCounter() {
//		int result1 = tester.incrementCounter("lucky");
//		var result2 = tester.incrementCounter("fizz");
//		var result3 = tester.incrementCounter("buzz");
//		var result4 = tester.incrementCounter("fizzBuzz");
//		var result5 = tester.incrementCounter("unaltered");
//
//	}
}