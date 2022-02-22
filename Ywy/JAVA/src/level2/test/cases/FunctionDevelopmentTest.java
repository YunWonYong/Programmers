package level2.test.cases;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import level2.FunctionDevelopment;

public class FunctionDevelopmentTest {
	private int[][] progresses;
	private int[][] speeds;
	private int[][] answers;
	private FunctionDevelopment functionDevelopment;
	@Before
	public void setUp() throws Exception {
		progresses = new int[][] {
			{93, 30, 55},
			{95, 90, 99, 99, 80, 99}
		};
		speeds = new int[][] {
			{1, 30, 5},
			{1, 1, 1, 1, 1, 1},
		};

		answers = new int[][] {
			{2, 1},
			{1, 3, 2}
		};
		
		functionDevelopment = new FunctionDevelopment();
	}

	@Test
	public void testSolution() {
		int index = 0;
		int range = progresses.length;
		int[] result = null;
		do {
			result = functionDevelopment.solution(progresses[index], speeds[index]);
			assertArrayEquals(String.format("result: %s, answer: %s", Arrays.toString(result), Arrays.toString(this.answers[index])), result, this.answers[index]);
		} while((++index) < range);
	}
}
