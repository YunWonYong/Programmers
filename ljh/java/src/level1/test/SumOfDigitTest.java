package level1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.SumOfDigit;

public class SumOfDigitTest {
	private int[] n;
	private int[] answers;
	private SumOfDigit sod;
	
	@Before
	public void setUp() throws Exception {
		n = new int[] {123, 987};
		answers = new int[] {6, 24};
		sod = new SumOfDigit();
	}
	
	@Test
	public void test() {
		for(int i=0; i<answers.length; i++) {
			assertEquals(sod.solution(n[i]), answers[i]);
		}
	}
}
