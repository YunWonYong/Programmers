package level2.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level2.StringCompression;

public class StringCompressionTest {
	private String[] inputs;
	private int[] answers;
	private StringCompression stringCompression;
	@Before
	public void setUp() throws Exception {
		inputs = new String[] {
			"aabbaccc",
			"ababcdcdababcdcd",
			"abcabcdede",
			"abcabcabcabcdededededede",
			"xababcdcdababcdcd"
		};
		answers = new int[] { 7, 9, 8, 14, 17 };
		
		stringCompression = new StringCompression();
	}

	@Test
	public void test() {
		int index = 0;
		int range = inputs.length;
		int result = -1;
		int answer = 0;
		do {
			result = stringCompression.solution(inputs[index]);
			answer = answers[index];
			assertEquals("success: "+ answer + ", result: " + result, result, answer);
		} while((++index) < range);
	}

}
