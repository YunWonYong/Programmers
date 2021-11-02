package ywy.java.level1.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.KthPlayer;

public class KthPlayerTest {
	private int[][] testCase;
	private int[] answer;
	private KthPlayer kthPlayer;
	@Before
	public void setUp() throws Exception {
		testCase = new int[][] {
				{2, 5, 3},
				{4, 4, 1},
				{1, 7, 3}
		};
		answer = new int[] {5, 6, 3};
		kthPlayer = new KthPlayer();
	}

	@Test
	public void test() {
		int[] answer = kthPlayer.solution(new int[] {1, 5, 2, 6, 3, 7, 4},  testCase);
		assertArrayEquals(answer, this.answer);
	}

}
