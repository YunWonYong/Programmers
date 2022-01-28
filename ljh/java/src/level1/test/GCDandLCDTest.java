package level1.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level1.GCDandLCM;
import level1.GCDandLCM2;

public class GCDandLCDTest {
	private int[] n;
	private int[] m;
	private int[][] answers;
	private GCDandLCM solution;
	private GCDandLCM2 solution2;
	
	@Before
	public void setUp() throws Exception {
		n = new int[] {3, 2};
		m = new int[] {12, 5};
		answers = new int[][] {{3,12}, {1,10}};
		solution = new GCDandLCM();
		solution2 = new GCDandLCM2();
	}
	
	@Test
	public void test() {
		for(int i=0; i<answers.length; i++) {
			assertArrayEquals(solution.solution(n[i], m[i]), answers[i]);
		}
	}
	
	@Test
	public void test2() {
		for(int i=0; i<answers.length; i++) {
			assertArrayEquals(solution2.solution(n[i], m[i]), answers[i]);
		}
	}
	
	@Test
	public void test3() {
		for(int i=0; i<answers.length; i++) {
			assertArrayEquals(solution2.solution2(n[i], m[i]), answers[i]);
		}
	}
	
}
