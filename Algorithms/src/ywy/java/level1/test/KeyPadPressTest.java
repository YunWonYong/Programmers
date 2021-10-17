package ywy.java.level1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.KeyPadPress;

public class KeyPadPressTest {
	private String[][] hands;
	private int[][] moveNumbers;
	private KeyPadPress KeyPadPress;
	@Before
	public void setUp() throws Exception {
		hands = new String[][]{
			{
				"right",
				"LRLLLRLLRRL" 
			},
			{
				"left",
				"LRLLRRLLLRR"
			},
			{
				"right",
				"LLRLLRLLRL"
			}
			
		};
		moveNumbers = new int[][] {
			{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5},
			{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2},
			{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}
		};
		KeyPadPress = new KeyPadPress();
	}

	@Test
	public void test() {
		int index = 0;
		int range = hands.length;
		String result = null;
		do {
			result = KeyPadPress.solution(moveNumbers[index], hands[index][0]);
			assertEquals("success: " + hands[index][1] + ", result: " + result, result, hands[index][1]);
		} while((++index) < range);
	}

}
