package level1.test;

import org.junit.Before;
import org.junit.Test;

import level1.CollatzConjecture;

public class CollatzConjectureTest {
	private int[] n;
	private int[] result;
	private CollatzConjecture collatz;
	
	@Before
	public void setUp() throws Exception {
		n = new int[] {6, 16, 626331};
		result = new int[] {8, 4, -1};
		collatz = new CollatzConjecture();
	}
	
	@Test
	public void test() {
		for(int i=0; i<result.length; i++) {
			assert(collatz.solution(n[i])==result[i]);
		}
	}
}
