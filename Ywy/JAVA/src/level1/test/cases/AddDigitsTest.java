package level1.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import level1.AddDigits;

public class AddDigitsTest {
	private int[] ns;
	private int[] answers;
	private AddDigits addDigits;
	@Before
	public void setUp() throws Exception {
		ns = new int[] {
			123,
			987
		};
		
		answers = new int[] {
			6,
			24
		};
		
		addDigits = new AddDigits();
	}

	@Test
	public void test() {
		int index = 0;
		int range = ns.length;
		do {
			assertTrue(addDigits.solution(ns[index]) == answers[index]);
		} while(++index < range);
	}
	
	@Test
	public void test2() {
		int index = 0;
		int range = ns.length;
		do {
			assertTrue(addDigits.solution2(ns[index]) == answers[index]);
		} while(++index < range);
	}
}
