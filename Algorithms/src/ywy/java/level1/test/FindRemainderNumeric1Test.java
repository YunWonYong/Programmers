package ywy.java.level1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.FindRemainderNumeric1;

public class FindRemainderNumeric1Test {
	private int[] ns;
	private int[] answers;
	private FindRemainderNumeric1 findRemainderNumeric1;
	@Before
	public void setUp() throws Exception {
		ns = new int[]{10, 12};
		answers = new int[]{3, 11};
		findRemainderNumeric1 = new FindRemainderNumeric1();
	}

	@Test
	public void test() {
		int index = 0;
		int range = ns.length;
		int answer = -9999_9999;
		do {
			answer = findRemainderNumeric1.solution(ns[index]);
			assertEquals(this.answers[index], answer);
		} while(++index < range);
	}

}
