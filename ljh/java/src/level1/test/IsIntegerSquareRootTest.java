package level1.test;

import org.junit.Before;
import org.junit.Test;

import level1.IsIntegerSquareRoot;

public class IsIntegerSquareRootTest {
	private long[] n;
	private	long[] answers;
	private IsIntegerSquareRoot solution;
	
	@Before
	public void setUp() throws Exception {
		n = new long[] {121, 3};
		answers = new long[] {144, -1};
		solution = new IsIntegerSquareRoot();
	}
	
	@Test
	public void test() {
		for(int i=0; i<answers.length; i++) {
			assert(solution.solution(n[i]) == answers[i]);
		}
	}
}

