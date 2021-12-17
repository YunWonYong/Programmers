package level1.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.SumBetweenTwoNumbers;

public class SumBetweenTwoNumbersTest {
	private int[] as;
	private int[] bs;
	private int[] result;
	private SumBetweenTwoNumbers sumBetweenTwoNumbers;
	@Before
	public void setUp() throws Exception {
		as = new int[] {
			3, 3, 5
		};
		bs = new int[] {
			5, 3, 3
		};
		
		result = new int[] {
			12, 3, 12
		};
		sumBetweenTwoNumbers = new SumBetweenTwoNumbers();
	}

	@Test
	public void test() {
		int index = 0;
		int range = as.length;
		long result = 0;
		do {
			result = sumBetweenTwoNumbers.solution(as[index], bs[index]);
			assertEquals(this.result[index], result);
		} while(++index < range);
	}

}
