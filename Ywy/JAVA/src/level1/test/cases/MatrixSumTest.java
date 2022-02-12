package level1.test.cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level1.MatrixSum;

public class MatrixSumTest {
	private int[][][] arrs;
	private int[][][] answers;
	private MatrixSum matrixSum;
	
	@Before
	public void setUp() throws Exception {
		arrs = new int[][][] {
			{
				{1, 2},
				{2, 3}	
			},
			{
				{3, 4},
				{5, 6},
			},
			{
				{1},
				{2}
			},
			{
				{3},
				{4}
			}
		};
		answers = new int[][][]{
			{
				{4, 6},
				{7, 9}
			},
			{
				{4},
				{6}
			}
		};
		matrixSum = new MatrixSum();
	}

	@Test
	public void test() {
		int index = 0;
		int range = arrs.length;
		int[][] result = null;
		int[][] answer = null;
		int index2 = 0;
		
		do {
			result = matrixSum.solution(arrs[index++], arrs[index]);
			answer = answers[index2++];
			assertArrayEquals(result, answer);
		} while(++index < range);
	}

}
