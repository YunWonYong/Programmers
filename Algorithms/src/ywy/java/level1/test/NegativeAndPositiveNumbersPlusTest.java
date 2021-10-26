package ywy.java.level1.test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.AddMissingNumber;
import ywy.java.level1.NegativeAndPositiveNumbersPlus;

public class NegativeAndPositiveNumbersPlusTest {
	private int[][] numbers;
	private boolean[][] signs;
	private NegativeAndPositiveNumbersPlus negativeAndPositiveNumbersPlus;
	@Before
	public void setUp() throws Exception {
		numbers = new int[][]{
			{4, 7, 12}, {9},
			{1, 2, 3}, {0},
			{9, 9, 9}, {27},
			{0, 0, 0}, {0},
			{9, 9, 9}, {-27},
			{1000, 1000, 1000}, {-3000}
		};
		
		signs = new boolean[][] {
			{true, false, true},
			{false, false, true},
			{true, true, true},
			{false, false, false},
			{false, false, false},
			{false, false, false}
		};
		negativeAndPositiveNumbersPlus = new NegativeAndPositiveNumbersPlus();
	}

	@Test
	public void test() {
		int index = 0;
		int range = numbers.length;
		int[] number = null; 
		int result = -1;
		int matchValue = -1;
		boolean[] signs = null;
		int signIndex = 0;
		do {
			signs = this.signs[signIndex++];
			number = numbers[index++];
			matchValue = numbers[index++][0];
			result = negativeAndPositiveNumbersPlus.solution(number, signs);
			assertEquals("success: "+ matchValue + ", result: " + result, result, matchValue);
		} while(index < range);
	}

}