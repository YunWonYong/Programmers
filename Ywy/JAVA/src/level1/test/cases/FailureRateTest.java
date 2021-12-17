package level1.test.cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level1.FailureRate;

public class FailureRateTest {
	private int[] ns;
	private int[][] stages;
	private int[][] result;
	private FailureRate failureRate;
	
	@Before
	public void setUp() throws Exception {
		ns = new int[] {5, 8, 
//				6, 
				5, 4, 2, 6, 4};
		stages = new int[][] {
			{2, 1, 2, 6, 2, 4, 3, 3},
			{1,2,3,4,5,6,7},
//			{1, 2, 3, 4, 5, 6, 7},
			{1,2,2,1,3},
			{1, 2, 3, 2, 1},
			{1, 2, 1, 2, 1, 1, 1, 1, 1},
			{7, 7, 7, 7, 7, 7, 7, 7, 7, 7}, // allClear
//			{5, 5, 2, 1, 2, 6, 2, 4, 3, 3},
			{4,4,4,4,4}
		};				
						
		result = new int[][] {
			{3,4,2,1,5},
			{7, 6, 5, 4, 3, 2, 1, 8},
//			{1, 2, 3, 4, 5, 6, 7},
			{3,2,1,4,5},
			{3, 2, 1, 4},
			{2, 1},
			{1, 2, 3, 4, 5, 6},
//			{3,4,2,5,1},
			{4,1,2,3}
		};
		failureRate = new FailureRate();
	}

	@Test
	public void test() {
		int index = 0;
		int range = ns.length;
		int[] result = null;
		do {
			result = failureRate.solution(ns[index], stages[index]);
			assertArrayEquals(this.result[index], result);
		} while((++index) < range);
	}

}
