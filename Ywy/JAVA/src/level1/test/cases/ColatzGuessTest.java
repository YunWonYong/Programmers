package level1.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.ColatzGuess;

public class ColatzGuessTest {
	private int[] ns;
	private int[] answers;
	private ColatzGuess colatzGuess;
	
	@Before
	public void setUp() {
		ns = new int[] {
			6,
			16,
			626331
		};
		answers = new int[] {
			8,
			4,
			-1
		};
		colatzGuess = new ColatzGuess();
	}
	
	@Test
	public void test() {
		int index = 0;
		int range = answers.length;
		do {
			assertEquals(colatzGuess.solution(ns[index]), answers[index]);
		} while(++index < range);
	}
}
