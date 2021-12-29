package level1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.SortInDescendingOrder;

public class SortInDescendingOrderTest {
	private String[] s;
	private String[] answers;
	private SortInDescendingOrder sortInDesendingOrder;

	@Before
	public void setUp() throws Exception {
		s = new String[]{
			"ABCDEFGHIJKLMNOPQRSTUVWXYZ",
			"abcdefghijklmnopqrstuvwxyz",
			"aaaaaaaaaaaa",
			"AAAAAAAAAAAA",
			"Aa",
			"Zbcdefg"
		};
		answers = new String[]{
			"ZYXWVUTSRQPONMLKJIHGFEDCBA",
			"zyxwvutsrqponmlkjihgfedcba",
			"aaaaaaaaaaaa",
			"AAAAAAAAAAAA",
			"aA",	
			"gfedcbZ"
		};
	}

	@Test
	public void test() {
		int index = 0;
		int range = answers.length;
		
		sortInDesendingOrder = new SortInDescendingOrder();
		
		do {
			assertEquals(sortInDesendingOrder.solution(s[index]), answers[index]);
		} while((++index) < range);
	}
}
