package level1.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level1.StringToInteger;

public class StringToIntegerTest {
	private String[] s;
	private int[] answers;
	private StringToInteger sToI;
	
	@Before
	public void setUp() throws Exception {
		s = new String[]{"1234", "-1234"};
		answers = new int[] {1234, -1234};
		sToI = new StringToInteger();
	}
	
	@Test
	public void test() {
		int[] solutions = new int[s.length];
		for(int i=0; i<s.length; i++) {
			solutions[i] = sToI.solution(s[i]);
		}
		assertArrayEquals(solutions, answers);
	}
}
