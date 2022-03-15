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
				"ACEGJL", 
				"BCDEGJ", 
				"CJNOP", 
				"CDF", 
				"ABCDF"
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

			{
				"XYZ",
				"XWY",
				"WXA"
			},
			{
				"ABCDE", 
				"AB", 
				"CDAB", 
				"ABDE", 
				"XABYZ", 
				"ABXYZ", 
				"ABCD", 
				"ABCDE", 
				"ABCDE", 
				"ABCDE", 
				"AB", 
				"AB", 
				"AB", 
				"AB", 
				"AB", 
				"AB", 
				"AB", 
				"AB", 
				"AB", 
				"AB"
			},
			{
				"ABCD", 
				"ABCD", 
				"ABCD"
			}, 
			{
				"ABCFG",
				"AC",
				"CDE",
				"ACDE",
				"BCFG",
				"ACDEH"
			},
		};
		
		courses = new int[][] {
			{2, 4, 5},
			{2, 3, 5},
			{2, 3, 4},
			{2},
			{2, 3, 4},
			{2, 3, 4},
		};
		
		answers = new String[][] {
			{
				"CD", 
				"CEGJ", 
				"CJ"
			},
			{
				"ACD",
				"AD",
				"ADE",
				"CD",
				"XYZ"
			},
			{
				"WX",
				"XY"
			},
			{
				"AB"
			},
			{
				"AB", 
				"ABC", 
				"ABCD", 
				"ABD", 
				"AC", 
				"ACD", 
				"AD", 
				"BC", 
				"BCD", 
				"BD", 
				"CD"
			},
			{
				"AC",
				"ACDE",
				"BCFG",
				"CDE"
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
