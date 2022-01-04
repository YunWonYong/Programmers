package level1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.FindKim;

public class FindKimTest {
	private String[] s;
	private String answer;
	private FindKim findKim;
	
	@Before
	public void setUp() throws Exception {
		s = new String[] {"Jane", "Kim"};
		answer = "김서방은 1에 있다";
		findKim = new FindKim();
	}
	
	@Test
	public void test() {
		assertEquals(findKim.solution(s), answer);
	}
}
