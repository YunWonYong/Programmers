package level1.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import level1.InnerProduct;

public class InnerProductTest {
	private int[][] testCase;
	private int[] answers;
	private InnerProduct innerProduct;
	@Before
	public void setUp() throws Exception {
		testCase = new int[][] {
				{1, 2, 3, 4},
				{-3, -1, 0, 2},
				{-1, 0, 1},
				{1, 0, -1}
		};
		answers = new int[] {3, -2};
		innerProduct = new InnerProduct();
	}

	@Test
	public void test() {
		int index = 0;
		int range = answers.length;
		int index2 = 0;
		int result = 0;
		int answer = 0;
		do {
			answer = answers[index];
			result = innerProduct.solution(testCase[index2++], testCase[index2++]);
			assertTrue(result == answer);
		} while(++index < range);
	}

}
