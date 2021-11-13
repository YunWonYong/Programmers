package ywy.java.level1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.GymSuit;

public class GymSuitTest {
	private int[] ns;
	private int[][] losts;
	private int[][] reserves;
	private int[] result;
	private GymSuit gymSuit;

	@Before
	public void setUp() throws Exception {
		ns = new int[] {
				7,
				3, 3, 3, 3, 3, 9, 7, 1, 2, 4, 5, 3, 5, 3, 5, 3, 7,
				5, 6, 8, 4, 10, 5, 5, 5, 3, 5, 5 };
		losts = new int[][] { { 1, 2, 3, 4, 5, 6, 7 }, { 1, 2 }, { 1 }, { 1, 2, 3 }, { 1, 2 }, { 1 }, { 5, 6, 8, 1, 2 }, 
				{ 1 }, { 2, 1 }, { 4, 2 }, { 3, 1 }, { 1, 2 }, { 2, 3, 4 }, { 3 }, { 2, 4 }, { 1, 3 }, { 1, 2, 3 },
				{ 2, 3 }, { 1, 2, 3, 4 }, { 3, 4, 7, 8 }, { 4, 2 }, { 5, 7, 9 }, { 3, 1 }, { 2, 4 }, { 2, 4 }, { 3 },
				{ 3, 5 }, { 2, 4 } };
		reserves = new int[][] {{ 1, 2, 3 },  { 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 }, { 1, 3 }, { 2 }, { 2, 3, 1, 4, 8, 9 },
				{ 1, 2, 3, 4, 5, 6, 7 }, { 1 }, { 1, 2 }, { 1, 3 }, { 2, 3 }, { 2, 3 }, { 1 }, { 3 },
				{ 2 }, { 1, 2, 3 }, { 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4, 5, 7, 8 }, { 1, 3 }, { 1, 2, 3, 4, 6, 8 },
				{ 2, 3 }, { 1, 3, 5 }, { 3 }, { 1 }, { 2, 4 }, { 3, 5 } };
		result = new int[] { 3, 3, 3, 3, 3, 3, 8, 7, 1, 2, 4, 5, 1, 4, 2, 2, 4, 3, 4, 6, 8, 4, 10, 5, 5, 4, 2, 5, 5 };
		gymSuit = new GymSuit();
	}

	@Test
	public void test() {
		int index = 0;
		int range = ns.length;
		int result = 0;
		do {
			result = gymSuit.solution(ns[index], losts[index], reserves[index]);
			assertEquals("testCase: " + index + ", success: " + this.result[index] + ", result: " + result, result,
					this.result[index]);
		} while ((++index) < range);
	}

}
