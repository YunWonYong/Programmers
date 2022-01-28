package level2.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level2.SliceNSquaredArray;

public class SliceNSquaredArrayTest {
	private int[] n;
	private long[] left;
	private long[] right;
	private int[][] answer;
	private SliceNSquaredArray slicedArr;
	
	@Before
	public void setUp() throws Exception {
		n = new int[] {3,4};
		left = new long[] {2,7};
		right = new long[] {5,14};
		answer = new int[][] {{3,2,2,3},{4,3,3,3,4,4,4,4}};
		slicedArr = new SliceNSquaredArray();
	}
	
	@Test
	public void test() {
		for(int i=0; i<answer.length; i++) {
			assertArrayEquals(slicedArr.solution(n[i], left[i], right[i]), answer[i]);
		}
	}
	
	@Test
	public void test2() {
		for(int i=0; i<answer.length; i++) {
			assertArrayEquals(slicedArr.solution2(n[i], left[i], right[i]), answer[i]);
		}
	}
}
