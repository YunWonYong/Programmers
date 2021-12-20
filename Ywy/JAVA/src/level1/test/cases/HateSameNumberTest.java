package level1.test.cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level1.HateSameNumber;

public class HateSameNumberTest {
	private int[][] arrs;
	private int[][] result;
	private HateSameNumber hateSameNumber;

	@Before
	public void setUp() throws Exception {
		arrs = new int[][] {
			{1, 1, 3, 3, 0, 1, 1}, 
			{4, 4, 4, 3, 3}
		};
		result = new int[][] {
			{1, 3, 0, 1},
			{4, 3}
		};
		hateSameNumber = new HateSameNumber();
	}

	@Test
	public void test() {
		int index = 0;
		int range = arrs.length;
		int[] result = null;
		do {
			result = hateSameNumber.solution(arrs[index]);
			assertArrayEquals("testCase: " + index + ", success: " + this.result[index] + ", result: " + result, result,this.result[index]);
		} while ((++index) < range);
	}
}
