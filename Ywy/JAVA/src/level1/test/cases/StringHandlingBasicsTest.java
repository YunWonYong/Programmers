package level1.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import level1.StringHandlingBasics;

public class StringHandlingBasicsTest {
	private String[] s;
	private boolean[] answers;
	private StringHandlingBasics stringHandlingBasics;
	
	@Before
	public void setUp() throws Exception {
		s = new String[]{
			"a234",
			"1234"
		};
		answers = new boolean[]{
			false,
			true
		};
		stringHandlingBasics = new StringHandlingBasics();
	}

	@Test
	public void test() {
		int index = 0;
		int range = s.length;
		do {
			assertTrue(stringHandlingBasics.solution(s[index]) == answers[index]);
		} while(++index < range);
	}

}
