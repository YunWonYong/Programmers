package level2.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import level2.PairRemove;

public class PairRemoveTest {
	private String[] s;
	private int[] result;
	private PairRemove pairRemove;
	@Before
	public void setUp() throws Exception {
		s = new String[] {
			"baabaa", "cdcd"
		};

		result = new int[] {
			1,
			0
		};
		
		pairRemove = new PairRemove();
	}

	@Test
	public void testSolution() {
		int index = 0;
		int range = s.length;
		long result = 0;
		do {
			result = pairRemove.solution(s[index]);
			assertTrue(result == this.result[index]);
		} while((++index) < range);
	}
}
