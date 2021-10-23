package ywy.java.level1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.AddMissingNumber;

public class AddMissingNumberTest {
	private int[][] numbers;
	private AddMissingNumber addmissingNumber;
	@Before
	public void setUp() throws Exception {
		numbers = new int[][]{
			{1,2,3,4,6,7,8,0},{14},
			{5,8,4,0,6,7,9},{6}
		};
		addmissingNumber = new AddMissingNumber();
	}

	@Test
	public void test() {
		int index = 0;
		int range = numbers.length;
		int[] number = null; 
		int result = -1;
		int matchValue = -1;
		do {
			number = numbers[index++];
			matchValue = numbers[index][0];
			result = addmissingNumber.solution(number);
			assertEquals("success: "+ matchValue + ", result: " + result, result, matchValue);
		} while((++index) < range);
	}

}
