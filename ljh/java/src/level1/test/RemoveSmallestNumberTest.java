package level1.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level1.RemoveSmallestNumber;

public class RemoveSmallestNumberTest {
	private int[][] arr;
	private int[][] answers;
	private RemoveSmallestNumber solution;
	
	@Before
	public void setUp() throws Exception {
		arr = new int[][]{{4,3,2,1},{10}};
		answers = new int[][] {{4,3,2}, {-1}};
		solution = new RemoveSmallestNumber();
	}
	
	@Test
	public void test() {
		for(int i=0; i<answers.length; i++) {
			assertArrayEquals(solution.solution(arr[i]), answers[i]);
		}
	}
	
	@Test
	public void test2() {
		for(int i=0; i<answers.length; i++) {
			assertArrayEquals(solution.solution2(arr[i]), answers[i]);
		}
	}
}
