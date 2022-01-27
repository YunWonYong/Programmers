package level1.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import level1.Average;

public class AverageTest {
	private int[][] arrs;
	private double[] answers;
	private Average average;
	
	@Before
	public void setUp() {
		arrs = new int[][] {
			{1, 2, 3, 4},
			{5, 5}
		};
		answers = new double[] {
			2.5,
			5.0
		};
		average = new Average();
	}
	
	@Test
	public void test() {
		int index = 0;
		int range = answers.length;
		do {
			assertTrue(average.solution(arrs[index]) == answers[index]);
		} while(++index < range);
	}
}
