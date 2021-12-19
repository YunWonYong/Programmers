package level1.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.DivisorCountPlus;


public class DiviserCountPlusTest {
	private int[] lefts;
	private int[] rights;
	private int[] result;
	private DivisorCountPlus diviserCountPlus;
	@Before
	public void setUp() throws Exception {
		lefts = new int[] {1, 13, 24};
		rights = new int[] {2, 17, 27};
		result = new int[] {1, 43, 52};
		diviserCountPlus = new DivisorCountPlus();
	}

	@Test
	public void test() {
		int index = 0;
		int range = lefts.length;
		int result = 0;
		do {
			result =  diviserCountPlus.solution(lefts[index], rights[index]);
			assertEquals("success: "+ this.result[index] + ", result: " + result, result, this.result[index]);
		} while((++index) < range);
	}

}
