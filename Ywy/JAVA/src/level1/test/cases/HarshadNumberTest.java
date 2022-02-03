package level1.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import level1.HarshadNumber;

public class HarshadNumberTest {
	private int[] ns;
	private boolean[] answers;
	private HarshadNumber harshadNumber;
	
	@Before
	public void setUp() {
		ns = new int[] {
			10,
			12,
			11,
			13
		};
		answers = new boolean[] {
			true,
			true,
			false,
			false
		};
		harshadNumber = new HarshadNumber();
	}
	
	@Test
	public void test() {
		int index = 0;
		int range = answers.length;
		do {
			assertTrue(harshadNumber.solution(ns[index]) == answers[index]);
		} while(++index < range);
	}

}
