package level1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.SumOfDivisor;

public class SumOfDivisorTest {
	private int[] n;
	private int[] answers;
	private SumOfDivisor sod;
	
	@Before
	public void setUp() throws Exception {
		n = new int[] {12, 5};
		answers = new int[] {28, 6};
		sod = new SumOfDivisor();
	}
	
	@Test
	public void test() {
		for(int i=0; i<answers.length; i++) {
			assertEquals(sod.solution(n[i]), answers[i]);
		}
	}
}
