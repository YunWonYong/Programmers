package level1.test;

import org.junit.Before;
import org.junit.Test;

import level1.CalculateAverage;

public class CalculateAverageTest {
	private int[][] arr;
	private double[] answer;
	private CalculateAverage average;
	
	@Before
	public void setUp() throws Exception {
		arr = new int[][] {{1,2,3,4}, {5,5}};
		answer = new double[] {2.5, 5};
		average = new CalculateAverage();
	}
	
	@Test
	public void test() {
		for(int i=0; i<arr.length; i++) {
			assert(average.solution(arr[i]) == answer[i]);
		}
	}
	
	@Test
	public void test2() {
		for(int i=0; i<arr.length; i++) {
			assert(average.solution2(arr[i]) == answer[i]);
		}
	}
}
