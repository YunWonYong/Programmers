package level1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.MakeStrangeText;

public class MakeStrangeTextTest {

	private String s;
	private String answer;
	private MakeStrangeText text;
	
	@Before
	public void setUp() throws Exception {
		s = "try hello world";
		answer = "TrY HeLlO WoRlD";
		text = new MakeStrangeText();
	}
	
	@Test
	public void test() {
		assertEquals(text.solution(s), answer);
	}
}
