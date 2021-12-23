package level1.test.cases;

import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;

import level1.PAndYCount;

public class PAndYCountTest {
	private String[] s;
	private boolean[] answers;
	private PAndYCount pAndYCount;
	
	@Before
	public void setUp() throws Exception {
		s = new String[]{
			"pPoooyY",
			"Pyy"
		};
		answers = new boolean[]{
			true,
			false
		};
		pAndYCount = new PAndYCount();
	}

	@Test
	public void test() {
		int index = 0;
		int range = answers.length;
		do {
			assertTrue(pAndYCount.solution(s[index]) == answers[index]);
		} while((++index) < range);
	}
}
