package level1.test.cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level1.ArrayNSqrt2Split;

public class ArrayNSqrt2SplitTest {
	private int[][] ns;
	private int[][] answers;
	private ArrayNSqrt2Split arrayNSqrt2Split;
	
	@Before
	public void setUp() throws Exception {
		ns = new int[][] {
			{3, 2, 5},
			{4, 7, 14},
		};
		answers = new int[][]{
			{3, 2, 2, 3},
			{4, 3, 3, 3, 4, 4, 4, 4},
		};
		arrayNSqrt2Split = new ArrayNSqrt2Split();
	}

	@Test
	public void test() {
		int index = 0;
		int range = ns.length;
		int[] ns = null;
		do {
			ns = this.ns[index];
			assertArrayEquals(arrayNSqrt2Split.solution(ns[0], ns[1], ns[2]), answers[index]);
		} while((++index) < range);
	}
}
