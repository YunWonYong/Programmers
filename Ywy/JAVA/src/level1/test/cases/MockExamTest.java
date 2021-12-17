package level1.test.cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level1.MockExam;

public class MockExamTest {
	private int[][] answerArr;
	private int[][] resultArr;
	private MockExam mockExam;
	@Before
	public void setUp() throws Exception {
		answerArr = new int[][]{
			{1, 2, 3, 4, 5},
			{1, 3, 2, 4, 2},
			{1, 2, 4, 5, 3, 1, 2, 3, 4, 2, 1, 4, 5 }, 
			{1, 2, 4, 5, 3, 1, 4, 4, 5, 5, 1, 4, 5 },
			{2, 1, 2, 2, 2, 2, 3, 1, 4, 4, 5, 5, 1, 4, 5 },
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
			{2, 1, 2, 3, 2, 4, 2, 5},
			{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
		};
		resultArr = new int[][] {
			{1},
			{1, 2, 3},
			{1},
			{1},
			{2},
			{1, 3},
			{2},
			{3}
		};
		mockExam = new MockExam();
	}

	@Test
	public void test() {
		int index = 0;
		int range = answerArr.length;
		int[] result = null;
		do {
			result = mockExam.solution(answerArr[index]);
			assertArrayEquals(result, resultArr[index]);
		} while((++index) < range);
	}

}
