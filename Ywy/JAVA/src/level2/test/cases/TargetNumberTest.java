package level2.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import level2.TargetNumber;

public class TargetNumberTest {
	private int[][] ns;
	private int[] targets;
	private int[] result;
	private TargetNumber targetNumber;
	@Before
	public void setUp() throws Exception {
		ns = new int[][] {
			{1, 1, 1, 1, 1},
			{4, 1, 2, 1}
		};
		targets = new int[] {
			3,
			4
		};

		result = new int[] {
			5,
			2
		};
		
		targetNumber = new TargetNumber();
	}

	@Test
	public void testSolution() {
		int index = 0;
		int range = ns.length;
		long result = 0;
		do {
			result = targetNumber.solution(ns[index], targets[index]);
			assertTrue(result == this.result[index]);
		} while((++index) < range);
	}
}
