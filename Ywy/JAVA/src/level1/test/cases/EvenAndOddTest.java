package level1.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.EvenAndOdd;

public class EvenAndOddTest {
	private int[] nums;
	private String[] answers;
	private EvenAndOdd evenAndOdd;
	
	@Before
	public void setUp() {
		nums = new int[] {2, 1};
		answers = new String[] {"Even", "Odd"};
		evenAndOdd = new EvenAndOdd();
	}
	
	@Test
	public void test() {
		int index = 0;
		int range = nums.length;
		do {
			assertEquals(evenAndOdd.solution(nums[index]), answers[index]);
		} while(++index < range);
	}

}
