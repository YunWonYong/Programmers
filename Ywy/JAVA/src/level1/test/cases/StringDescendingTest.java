package level1.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.StringDescending;

public class StringDescendingTest {
	private String[] s;
	private String[] answers;
	private StringDescending stringDescending;
	
	@Before
	public void setUp() throws Exception {
		s = new String[]{
			"ABCDEFGHIJKLMNOPQRSTUVWXYZ",
			"abcdefghijklmnopqrstuvwxyz",
			"aaaaaaaaaaaa",
			"AAAAAAAAAAAA",
			"Aa",
			"Zbcdefg"
		};
		answers = new String[]{
			"ZYXWVUTSRQPONMLKJIHGFEDCBA",
			"zyxwvutsrqponmlkjihgfedcba",
			"aaaaaaaaaaaa",
			"AAAAAAAAAAAA",
			"aA",	
			"gfedcbZ"
		};
		stringDescending = new StringDescending();
	}

	@Test
	public void test() {
		int index = 0;
		int range = answers.length;
		do {
			assertEquals(stringDescending.solution(s[index]), answers[index]);
		} while((++index) < range);
	}

}
