package level2.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import level2.IntactSquare;

public class IntactSquareTest {
	private int[][] ns;
	private long[] answers;
	private IntactSquare intactSquare;
	@Before
	public void setUp() throws Exception {
		ns = new int[][] {
			{8, 12},
			{2, 10}
		};
		answers = new long[] {
			80,
			10
		};
		
		intactSquare = new IntactSquare();
	}

	@Test
	public void testSolution() {
		int index = 0;
		int range = ns.length;
		long result = 0;
		do {
			result = intactSquare.solution(ns[index][0], ns[index][1]);
			assertTrue(result == answers[index]);
		} while((++index) < range);
	}
}
