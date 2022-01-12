package level1.test.cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level1.ArrayByFlippingNumbers;

public class ArrayByFlippingNumbersTest {
	private long[] ns;
	private int[][] answers;
	private ArrayByFlippingNumbers arrayByFlippingNumbers;
	
	@Before
	public void setUp() throws Exception {
		ns = new long[] {
			12345,
			8764321,
			9760485
		};
		answers = new int[][]{
			{5, 4, 3, 2, 1},
			{1, 2, 3, 4, 6, 7, 8},
			{5, 8, 4, 0, 6, 7, 9}
		};
		arrayByFlippingNumbers = new ArrayByFlippingNumbers();
	}

	@Test
	public void test() {
		int index = 0;
		int range = ns.length;
		do {
			assertArrayEquals(arrayByFlippingNumbers.solution(ns[index]), answers[index]);
		} while((++index) < range);
	}

}
