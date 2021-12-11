package ywy.java.level1.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.NumberStrToNumber;

public class NumberStrToNumberTest {
	private String[][] testCase;
	private NumberStrToNumber numberStrToNumber;
	@Before
	public void setUp() throws Exception {
		testCase = new String[][] {
				{
					"one4seveneight",
					"1478"
				},
				{
					"23four5six7",
					"234567"
				},
				{
					"2three45sixseven",
					"234567"
				},
				{
					"123",
					"123"
				}
		};
		numberStrToNumber = new NumberStrToNumber();
	}

	@Test
	public void test() {
		int index = 0;
		int range = testCase.length;
		String[] testData = null;
		int result = 0;
		do {
			testData = testCase[index++];
			result = numberStrToNumber.solution(testData[0]);
			assertTrue(result == Integer.parseInt(testData[1]));
		} while(index < range);
	}

}
