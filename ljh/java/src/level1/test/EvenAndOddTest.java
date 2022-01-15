package level1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.EvenAndOdd;

public class EvenAndOddTest {
	private int[] nums;
	private String[] answers;
	private EvenAndOdd eo;
	
	@Before
	public void setUp() throws Exception {
		nums = new int[] {3, 4};
		answers = new String[] {"Odd", "Even"};
		eo = new EvenAndOdd();
	}
	
	@Test
	public void test() {
		for(int i=0; i<answers.length; i++) {
			assertEquals(eo.solution(nums[i]), answers[i]);
		}
	}
}
