package ywy.java.level1.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.Year2016;

public class Year2016Test {
	private int[] months;
	private int[] dates;
	private String[] days;
	private Year2016 year2016;
	@Before
	public void setUp() throws Exception {
		months = new int[] {5, 11, 11};
		dates = new int[] {24, 7, 11};
		days = new String[] {"TUE", "MON", "FRI"};
		year2016 = new Year2016();
	}

	@Test
	public void test() throws Exception {
		int index = 0;
		int range = months.length;
		String answer = null;
		do {
			answer = year2016.solution(months[index], dates[index]);
			assertEquals(this.days[index], answer);
		} while(++index < range);
	}

}
