package ywy.java.level1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.MinimumRectangle;

public class MinimumRectangleTest {
	private int[][][] sizesArr;
	private int[] answers;
	private MinimumRectangle minimumRectangle;
	@Before
	public void setUp() throws Exception {
		sizesArr = new int[][][] {
			{
				{10, 7}, // 7, 10
				{12, 3}, // 12, 3
				{8, 15}, // 8, 15
				{14, 7}, // 14, 7
				{5, 15}
			},
			{
				{60, 50},
				{30, 70},
				{60, 30},
				{80, 40}
			},
			{
				{14, 4},
				{19, 6},
				{6, 16},
				{18, 7},
				{7, 11}
			}
		};
		answers = new int[] {120, 4000, 133};
		minimumRectangle = new MinimumRectangle();
	}

	@Test
	public void test() throws Exception {
		int index = 0;
		int range = sizesArr.length;
		int answer = 0;
		do {
			answer = minimumRectangle.solution(sizesArr[index]);
			assertEquals(this.answers[index], answer);
		} while(++index < range);
	}

}
