package level1.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import level1.PrimeNumberFind;

public class PrimeNumberFindTest {
	private int[] ns;
	private int[] answers;
	private PrimeNumberFind primeNumberFind;
	
	@Before
	public void setUp() {
		ns = new int[] {10, 5, 100, 1000, 7919, 10000};
		answers = new int[] {4, 3, 25, 168, 1000, 1229};
		primeNumberFind = new PrimeNumberFind();
	}

	@Test
	public void test() {
		int index = 0;
		int range = ns.length;
		do {
			assertTrue(primeNumberFind.solution(ns[index]) == answers[index]);
		} while(++index < range);
	}
}
