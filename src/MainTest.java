import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

	@Test
	public void testRun() {
		Main tester = new Main();

		int number1 = 43;
		int number2 = 15;
		int number3 = 20;
		int number4 = 18;
		int number5 = 13;

		assertTrue(Integer.toString(number1).contains("3"));
		assertFalse(Integer.toString(number2).contains("3"));

		// test modulus 15 logic:
		int result1 = number1 % 15;
		int result2 = number2 % 15;

		assertNotEquals(0, result1);
		assertEquals(0, result2);

		// test modulus 3 logic
		int result3 = number3 % 3;
		int result4 = number4 % 3;

		assertNotEquals(0, result3);
		assertEquals(0, result4);

		// test modulus 5 logic
		int result5 = number5 % 5;
		int result6 = number3 % 5;

		assertNotEquals(0, result5);
		assertEquals(0, result6);
	}
}