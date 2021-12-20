package level1.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.GymSuit;

public class GymSuitTest {
	private int[] ns;
	private int[][] losts;
	private int[][] reserves;
	private int[] result;
	private GymSuit gymSuit;

	@Before
	public void setUp() throws Exception {
		ns = new int[] {5, 5, 3};
		losts = new int[][] {{2, 4}, {2, 4}, {3}};
		reserves = new int[][] {{1, 3, 5}, {3}, {1}};
		result = new int[] {5, 4, 2};
		gymSuit = new GymSuit();
	}

	@Test
	public void test() {
		int index = 0;
		int range = ns.length;
		int result = 0;
		do {
			result = gymSuit.solution(ns[index], losts[index], reserves[index]);
			assertEquals("testCase: " + index + ", success: " + this.result[index] + ", result: " + result, result,this.result[index]);
		} while ((++index) < range);
	}

}
