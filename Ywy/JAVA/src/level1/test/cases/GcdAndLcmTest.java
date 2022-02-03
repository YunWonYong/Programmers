package level1.test.cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level1.GcdAndLcm;

public class GcdAndLcmTest {
	private int[][] numbers;
	private int[][] answer;
	private GcdAndLcm gcdAndLcm;
	@Before
	public void setUp() throws Exception {
		numbers = new int[][]{
			{3, 12},
			{2, 5}
		};
		answer = new int[][] {
			{3, 12},
			{1, 10}
		};
		gcdAndLcm = new GcdAndLcm();
	}

	@Test
	public void test() {
		int index = 0;
		int range = numbers.length;
		int[] result = null;
		do {
			result = numbers[index];
			result = gcdAndLcm.solution(result[0], result[1]);
			assertArrayEquals(result, answer[index]);
		} while((++index) < range);
	}

}
