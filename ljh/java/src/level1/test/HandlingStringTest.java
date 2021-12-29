package level1.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import level1.HandlingString;

public class HandlingStringTest {
	private String[] s;
	private boolean[] answers;
	private HandlingString handlingString;
	
	@Before
	public void setUp() throws Exception {
		s = new String[] {"a234", "1234"};
		answers = new boolean[] {false, true};
		handlingString = new HandlingString();
	}
	
	@Test
	public void test() {
		for(int i=0; i<answers.length; i++) {
			assertTrue(handlingString.solution(s[i]) == answers[i]);
		}
	}
	@Test
	public void test2() {
		for(int i=0; i<answers.length; i++) {
			assertTrue(handlingString.solution2(s[i]) == answers[i]);
		}
	}
	
}