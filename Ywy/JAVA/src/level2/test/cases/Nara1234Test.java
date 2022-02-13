package level2.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level2.Nara1234;

public class Nara1234Test {
	private int[] ns;
	private String[] answers;
	private Nara1234 nara1234;
	@Before
	public void setUp() throws Exception {
		ns = new int[] {
			364,
			40,
			39,
			120,
			121,
			1,
			4,
			13
		};
		answers = new String[] {
			"111111",
			"1111",
			"444",
			"4444",
			"11111",
			"1",
			"11",
			"111"
		};
		
		nara1234 = new Nara1234();
	}

	@Test
	public void testSolution() {
		int index = 0;
		int range = ns.length;
		String result = null;
		do {
			result = nara1234.solution(ns[index]);
			assertEquals("success: "+ answers[index] + ", result: " + result, answers[index], result);
		} while((++index) < range);
	}
}
