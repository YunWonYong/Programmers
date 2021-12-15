package ywy.java.level1.test.cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.DivisibleNumber;


public class DivisibleNumberTest {
	private int[][] arrs;
	private int[] divisor;
	private int[][] result;
	private DivisibleNumber divisibleNumber;
	@Before
	public void setUp() throws Exception {
		arrs = new int[][] {
			{5, 9, 7, 10},
			{2, 36, 1, 3},
			{3, 2, 6}
		};
		divisor = new int[] {
			5,
			1,
			10
		};
		result = new int[][] {
			{5, 10},
			{1, 2, 3, 36},
			{-1}
		};
		divisibleNumber = new DivisibleNumber();
	}

	@Test
	public void test() {
		int index = 0;
		int range = arrs.length;
		int[] result = null;
		do {
			result =  divisibleNumber.solution(arrs[index], divisor[index]);
			assertArrayEquals("success: "+ this.result[index] + ", result: " + result, result, this.result[index]);
		} while((++index) < range);
	}

}
