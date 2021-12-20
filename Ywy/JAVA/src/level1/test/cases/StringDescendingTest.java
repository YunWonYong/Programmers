package level1.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.StringDescending;

public class StringDescendingTest {
	private String[] strs;
	private String[] answer;
	private StringDescending stringDescending;
	@Before
	public void setUp() throws Exception {
		strs = new String[] {
			"Zbcdefg",
			"gfedcbZ",
			"abcdefg",
			"ABCDEFG",
			"abcdefghijklmnopqrstuvwxyz",
			"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		};
		
		answer = new String[] {
			"gfedcbZ",
			"gfedcbZ",
			"gfedcba",
			"GFEDCBA",
			"zyxwvutsrqponmlkjihgfedcba",
			"ZYXWVUTSRQPONMLKJIHGFEDCBA"
		};
		
		stringDescending = new StringDescending();
	}
	@Test
	public void test() {
		int index = 0;
		int range = strs.length;
		String result = null;
		
		do {
			result = stringDescending.solution(strs[index]);
			assertEquals(result.toString() + " != " + answer[index], result, answer[index]);
		} while(++index < range);
	}

}
