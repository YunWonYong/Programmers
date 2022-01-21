package level1.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import level1.NumberSquareRootDiscrimination;

public class NumberSquareRootDiscriminationTest {
	private int[] ns;
	private int[] answers;
	private NumberSquareRootDiscrimination numberSquareRootDiscrimination;
	@Before
	public void setUp() throws Exception {
		ns = new int[]{121, 3, 1};
		answers = new int[] {144, -1, 4};
		numberSquareRootDiscrimination = new NumberSquareRootDiscrimination();
	}
	
	@Test
	public void test() {
		int index = 0;
		int range = ns.length;
		do {
			assertTrue(numberSquareRootDiscrimination.solution(ns[index]) == answers[index]);
		} while(++index < range);
	}
	
	@Test
	public void test2() {
		int index = 0;
		int range = ns.length;
		do {
			assertTrue(numberSquareRootDiscrimination.solution2(ns[index]) == answers[index]);
		} while(++index < range);
	}

}
