package level1.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import level1.CountPAndY;

public class CountPAndYTest {
	private String[] s;
	private boolean[] answers;
	private CountPAndY countPAndY;

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
	}

	@Test
	public void test() {
		int index = 0;
		int range = answers.length;
		
		countPAndY = new CountPAndY();
		
		do {
			assertTrue(countPAndY.solution(s[index]) == answers[index]);
		} while((++index) < range);
	}
}

