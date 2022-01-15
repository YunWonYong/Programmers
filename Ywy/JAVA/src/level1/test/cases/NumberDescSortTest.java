package level1.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import level1.NumberDescSort;

public class NumberDescSortTest {
	private long[] ns;
	private long[] answers;
	private NumberDescSort numberDescSort;
	@Before
	public void setUp() throws Exception {
		ns = new long[]{118372};
		answers = new long[] {873211};
		numberDescSort = new NumberDescSort();
	}
	
	@Test
	public void test() {
		int index = 0;
		int range = ns.length;
		do {
			assertTrue(numberDescSort.solution(ns[index]) == answers[index]);
		} while(++index < range);
	}

}
