package level1.test.cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level1.MinNumberRemove;

public class MinNumberRemoveTest {
	private int[][] arrs;
	private int[][] answers;
	private MinNumberRemove minNumberRemove;
	
	@Before
	public void setUp() throws Exception {
		arrs = new int[][]{
			{4, 3, 1, 2},
			{4, 3, 2, 1},
			{10}
		};
		answers = new int[][] {
			{4, 3, 2},
			{4, 3, 2},
			{-1}
		};
		minNumberRemove = new MinNumberRemove();
	}
	
	@Test
	public void test() {
		int index = 0;
		int range = arrs.length;
		do {
			assertArrayEquals(minNumberRemove.solution(arrs[index]), answers[index]);
		} while(++index < range);
	}

}
