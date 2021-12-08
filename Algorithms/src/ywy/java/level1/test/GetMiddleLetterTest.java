package ywy.java.level1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.GetMiddleLetter;

public class GetMiddleLetterTest {
	private String[] ss;
	private String[] result;
	private GetMiddleLetter getMiddleLetter;
	
	@Before
	public void setUp() throws Exception {
		ss = new String[] {"abcde", "qwer"};
		result = new String[] {"c", "we"};
		getMiddleLetter = new GetMiddleLetter();
	}

	@Test
	public void test() {
		int index = 0;
		int range = ss.length;
		String answer = null;
		do {
			answer = getMiddleLetter.solution(ss[index]);
			assertEquals(answer, result[index]);
		} while(++index < range);
	}

}
