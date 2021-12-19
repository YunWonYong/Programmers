package level1.test.cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level1.TwoNumberPlus;

public class TwoNumberPlusTest {
	private int[][] ds;
	private int[][] answer;
	private TwoNumberPlus twoNumberPlus;
	@Before
	public void setUp() throws Exception {
		ds = new int[][] {
			{5,0,2,7},
			{2,1,3,4,1},
		};
		answer = new int[][] {
			{2,5,7,9,12},
			{2,3,4,5,6,7},
		};
		twoNumberPlus = new TwoNumberPlus();
	}

	@Test
	public void test() {
		int index = 0;
		int range = ds.length;
		int[] answer = null;
		do {
			answer = twoNumberPlus.solution(ds[index]);
			assertArrayEquals(this.answer[index], answer);
		} while(++index < range);
	}

}
