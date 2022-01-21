package level1.test;

import org.junit.Before;
import org.junit.Test;

import level1.ArrangeIntegerInDescendingOrder;

public class ArrangeIntegerInDescendingOrderTest {
	private long n;
	private long answer;
	private ArrangeIntegerInDescendingOrder solution;
	
	@Before
	public void setUp() throws Exception {
		n = 118372;
		answer = 873211;
		solution = new ArrangeIntegerInDescendingOrder();
	}
	
	@Test
	public void test() {
		assert(solution.solution(n) == answer);
	}
	
	@Test
	public void test2() {
		assert(solution.solution2(n) == answer);
	}
	
	@Test
	public void test3() {
		assert(solution.solution3(n) == answer);
	}
}
