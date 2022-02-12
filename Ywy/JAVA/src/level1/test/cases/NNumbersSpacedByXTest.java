package level1.test.cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level1.NNumbersSpacedByX;

public class NNumbersSpacedByXTest {
	private int[][] ns;
	private long[][] answers;
	private NNumbersSpacedByX nNumbersSpacedBy;

	@Before
	public void setUp() throws Exception {
		ns = new int[][] { 
			{ 2, 5 }, 
			{ 4, 3 }, 
			{ -4, 2 } 
		};
		answers = new long[][] { 
			{ 2, 4, 6, 8, 10 }, 
			{ 4, 8, 12 }, 
			{ -4, -8 }, 
		};
		nNumbersSpacedBy = new NNumbersSpacedByX();
	}

	@Test
	public void test() {
		int index = 0;
		int range = ns.length;
		int[] ns = null;
		do {
			ns = this.ns[index];
			assertArrayEquals(nNumbersSpacedBy.solution(ns[0], ns[1]), answers[index]);
		} while ((++index) < range);
	}
}
