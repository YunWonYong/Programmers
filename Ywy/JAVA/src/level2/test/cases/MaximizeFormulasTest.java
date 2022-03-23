package level2.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import level2.MaximizeFormulas;

public class MaximizeFormulasTest {
	private String[] expressions;
	private int[] answers;
	private MaximizeFormulas maximizeFormulas;
	
	@Before
	public void setUp() {
		expressions = new String[] {
			//"5-30-5-5+2+2",
			"2-990-5+2",
			"50+1-4",
			"1-1-1-2+1+2-1-1",
			"100-200*300-500+20",
			"50*6-3*2",
			"1+1+1",
			"1-1-1",
			"1*1*1",
		};
		answers = new int[] {
			995,
			47,
			8,
			60420,
			300,
			3,
			1,
			1,
		};
		maximizeFormulas = new MaximizeFormulas();
	}
	
	@Test
	public void test() {
		int index = 0;
		int range = expressions.length;
		String expression = null;
		do {
			expression = expressions[index];
			assertTrue(answers[index] == maximizeFormulas.solution(expression));
		} while(++index < range);
	}
}
