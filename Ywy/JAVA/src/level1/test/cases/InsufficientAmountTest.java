package level1.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.InsufficientAmount;

public class InsufficientAmountTest {
	private int[][] params;
	private long[] answer;
	private InsufficientAmount insufficientAmount;
	@Before
	public void setUp() throws Exception {
		params = new int[][] {
			{3, 20, 4}
		};
		answer = new long[] {
			10
		};
		insufficientAmount = new InsufficientAmount();
	}

	@Test
	public void test() {
		int index = 0;
		int range = params.length;
		int [] param = null;
		long answer = -999;
		do {
			param = params[index];
			answer = insufficientAmount.solution(param[0], param[1], param[2]);
			assertEquals(this.answer[index], answer);
		} while(++index < range);
	}

}
