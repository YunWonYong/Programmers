package level1.test.cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level1.MyWaySorting;

public class MyWaySortingTest {
	private String[][] strs;
	private String[][] answers;
	private int[] ns;
	private MyWaySorting myWaySorting;
	@Before
	public void setUp() throws Exception {
		strs = new String[][]{
			{"sun", "bed", "car"},
			{"abce", "abcd", "cdx"}
		};
		answers = new String[][] {
			{"car", "bed", "sun"},
			{"abcd", "abce", "cdx"}
		};
		
		ns = new int[] {
			1,
			2
		};
		
		myWaySorting = new MyWaySorting();
	}

	@Test
	public void test() {
		int index = 0;
		int range = strs.length;
		String[] result = null;
		do {
			result = myWaySorting.solution(strs[index], ns[index]);
			assertArrayEquals(this.answers[index], result);
		} while((++index) < range);
	}
}
