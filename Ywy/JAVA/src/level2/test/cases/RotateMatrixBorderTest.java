package level2.test.cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level2.RotateMatrixBorder;

public class RotateMatrixBorderTest {
	private int[] rows;
	private int[] columns;
	private int[][][] queries;
	private int[][] answers;
	private RotateMatrixBorder rotateMatrixBorder;
	@Before
	public void setUp() throws Exception {
		rows = new int[] {
			6, 3, 100
		};
		columns = new int[] {
			6, 3, 97
		};

		queries = new int[][][] {
			{
				{2, 2, 5, 4},
				{3, 3, 6, 6},
				{5, 1, 6, 3}
			},
			{
				{1, 1, 2, 2},
				{1, 2, 2, 3},
				{2, 1, 3, 2},
				{2, 2, 3, 3},
			},
			{
				{1, 1, 100, 97}
			}
		};
		
		answers = new int[][] {
			{8, 10, 25},
			{1, 1, 5, 3},
			{1}
		};
		
		rotateMatrixBorder = new RotateMatrixBorder();
	}

	@Test
	public void testSolution() {
		int index = 0;
		int range = rows.length;
		int[] result = null;
		do {
			result = rotateMatrixBorder.solution(rows[index], columns[index], queries[index]);
			assertArrayEquals(result, this.answers[index]);
		} while((++index) < range);
	}
}
