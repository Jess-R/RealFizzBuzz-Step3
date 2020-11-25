import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
	private final Main tester = new Main();
	private final int number1 = 43;
	private final int number2 = 15;

	@Test
	public void testRun() {
		assertTrue(Integer.toString(number1).contains("3"));
		assertFalse(Integer.toString(number2).contains("3"));
	}

	@Test
	public void testIsMultipleOf15() {
		boolean result1 = tester.isMultipleOf15(number1);
		boolean result2 = tester.isMultipleOf15(number2);

		assertFalse(result1);
		assertTrue(result2);
	}

	@Test
	public void testIsMultipleOf3() {
		boolean result1 = tester.isMultipleOf3(number1);
		boolean result2 = tester.isMultipleOf3(number2);

		assertFalse(result1);
		assertTrue(result2);
	}

	@Test
	public void testIsMultipleOf5() {
		boolean result1 = tester.isMultipleOf5(number1);
		boolean result2 = tester.isMultipleOf5(number2);

		assertFalse(result1);
		assertTrue(result2);
	}
}