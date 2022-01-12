package level1.test.cases;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.WeirdStringMake;

public class WeirdStringMakeTest {
	private String[] strs;
	private String[] answers;
	private WeirdStringMake weirdStringMake;
	
	@Before
	public void setUp() throws Exception {
		strs = new String[] {
			"try hello world",
			"tRy hElLo wOrLd",
			"try  hello  world"
		};
		
		answers = new String[] {
			"TrY HeLlO WoRlD",
			"TrY HeLlO WoRlD",
			"TrY  HeLlO  WoRlD"
		};
		
		weirdStringMake = new WeirdStringMake(); 
	}

	@Test
	public void test() {
		int index = 0;
		int range = strs.length;
		do {
			assertEquals(weirdStringMake.solution(strs[index]), answers[index]);
		} while(++index < range);
	}

}
