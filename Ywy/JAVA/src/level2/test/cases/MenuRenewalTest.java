package level2.test.cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level2.MenuRenewal;

public class MenuRenewalTest {
	private String[][] orders;
	private int[][] courses;
	private String[][] answers;
	private MenuRenewal menuRenewal;
	
	@Before
	public void setUp() throws Exception {
		orders = new String[][] {
			{
				"XYZ",
				"XWY",
				"WXA"
			},
			{
				"ABCFG",
				"AC",
				"CDE",
				"ACDE",
				"BCFG",
				"ACDEH"
			},
			{
				"ABCDE",
				"AB",
				"CD",
				"ADE",
				"XYZ",
				"XYZ",
				"ACD"
			},
		};
		
		courses = new int[][] {
			{2, 3, 4},
			{2, 3, 4},
			{2, 3, 5}
		};
		
		answers = new String[][] {

			{
				"WX",
				"XY"
			},
			{
				"AC",
				"ACDE",
				"BCFG",
				"CDE"
			},
			{
				"ACD",
				"AD",
				"ADE",
				"CD",
				"XYZ"
			},
		};
		
		menuRenewal = new MenuRenewal(); 
	}

	@Test
	public void testSolution() {
		int index = 0;
		int range = answers.length;
		String[] result = null;
		do {
			result = menuRenewal.solution(orders[index], courses[index]);
			assertArrayEquals(result, answers[index]);
		} while(++index < range);
	}

}
