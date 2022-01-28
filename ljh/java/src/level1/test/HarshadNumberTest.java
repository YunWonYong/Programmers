package level1.test;

import org.junit.Before;
import org.junit.Test;

import level1.HarshadNumber;

public class HarshadNumberTest {
	private int[] arr;
	private boolean[] answer;
	private HarshadNumber harshad;
	
	@Before
	public void setUp() throws Exception {
		arr = new int[] {10, 12, 11, 13};
		answer = new boolean[] {true, true, false, false};
		harshad = new HarshadNumber();
	}
	
	@Test
	public void test() {
		for(int i=0; i<arr.length; i++) {
			assert(harshad.solution(arr[i]) == answer[i]);
		}
	}
}
