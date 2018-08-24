package factorial.com.dbs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTest {
	@Test
	public void factorialOf_0_is_1() {
		// Test that the factorial of 0 is 1.
		int expected = 1;
		int actual = Factorial.factorial(0);
		assertEquals(expected, actual);
	}
	
	@Test
	public void factorialOf_2_is_2() {
		// Test that the factorial of 2 is 2.
		int expected = 2;
		int actual = Factorial.factorial(2);
		assertEquals(expected, actual);
	}
	
	@Test
	public void factorialOf_3_is_6() {
		// Test that the factorial of 3 is 6.
		int expected = 6;
		int actual = Factorial.factorial(3);
		assertEquals(expected, actual);
	}

}
