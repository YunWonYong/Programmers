package ywy.java.level1.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.TernaryFlip;

public class TernaryFlipTest {
	private int[] ns;
	private int[] results;
	private TernaryFlip ternaryFlip;
	@Before
	public void setUp() throws Exception {
		ns = new int[]{
			125 , 45, 
		};
		results = new int[] {
			229, 7, 
		};
		ternaryFlip = new TernaryFlip();
	}

	@Test
	public void test() {
		int index = 0;
		int range = ns.length;
		do {
			assertTrue(results[index] == ternaryFlip.solution(ns[index]));
		} while((++index) < range);
	}

}
