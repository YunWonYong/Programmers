package level1.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import level1.StringToIntegerChange;

public class StringToIntegerChangeTest {
	private String[] integerStrings;
	private int[] answers;
	private StringToIntegerChange stringToIntegerChange; 
	
	@Before
	public void setUp() throws Exception {
		integerStrings = new String[] {
			"-9999",
			"9999",
			"-1234",
			"1234"
		};
		answers = new int[] {
			-9999,
			9999,
			-1234,
			1234
		};
		stringToIntegerChange = new StringToIntegerChange();
	}

	@Test
	public void test() {
		int index = 0;
		int range = answers.length;
		do {
			assertTrue(stringToIntegerChange.solution(integerStrings[index]) == answers[index]);
		} while(++index < range);
	}

}
