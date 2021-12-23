package level1.test.cases;


import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import level1.MyWaySorting;

public class MyWaySortingTest {
	private String[][] strings;
	private String[][] answers;
	private int[] ns;
	private MyWaySorting myWaySorting;
	
	@Before
	public void setUp() throws Exception {
		strings = new String[][]{
			{
				"sun", "bed", "car"
			},
			{
				"abce", "abcd", "cdx"
			}
		};
		answers = new String[][] {
			{
				"car", "bed", "sun"
			},
			{
				"abcd", "abce", "cdx"
			}
		};
		ns = new int[] {1, 2};
		myWaySorting = new MyWaySorting();
	}

	@Test
	public void test() {
		int index = 0;
		int range = strings.length;
		String[] result = null;
		do {
			result = myWaySorting.solution(strings[index], ns[index]);
			assertArrayEquals(String.format("answer: %s, result: %s", Arrays.toString(answers[index]), Arrays.toString(result)), result, answers[index]);
		} while((++index) < range);
	}
}
