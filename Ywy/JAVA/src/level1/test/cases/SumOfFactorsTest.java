package level1.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import level1.SumOfFactors;

public class SumOfFactorsTest {
	private int[] ns;
	private int[] answers;
	private SumOfFactors sumOfFactors;
	
	@Before
	public void setUp() throws Exception {
		ns = new int[] {
			12,
			5,
			2,
			1,
			0
		};
		
		answers = new int[] {
			28,
			6,
			3,
			1,
			0
		};
		
		sumOfFactors = new SumOfFactors();
	}
	
	@Test
	public void test() {
		int index = 0;
		int range = ns.length;
		int n = 0;
		int answer = 0;
		do {
			n = sumOfFactors.solution(ns[index]);
			answer = answers[index];
			assertTrue(String.format("return: %d, answer: %d", n, answer), n == answer);
		} while(++index < range);
	}
	
	@Test
	public void test2() {
		int index = 0;
		int range = ns.length;
		do {
			assertTrue(sumOfFactors.solution2(ns[index]) == answers[index]);
		} while(++index < range);
	}

}
