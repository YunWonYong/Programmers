package level1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.ReverseNumber;

public class ReverseNumberTest {
	private long n;
	private int[] answer;
	private ReverseNumber rn;
	
	@Before
	public void setUp() throws Exception {
		n = 12345;
		answer = new int[] {5,4,3,2,1};
		rn = new ReverseNumber();
	}
	
	@Test
	public void test() {
		assertEquals(rn.solution(n), answer);
	}
}
