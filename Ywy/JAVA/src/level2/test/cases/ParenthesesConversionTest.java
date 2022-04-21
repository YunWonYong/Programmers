package level2.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level2.ParenthesesConversion;

public class ParenthesesConversionTest {
	private String[] ps;
	private String[] answers;
	private ParenthesesConversion parenthesesConversion;
	@Before
	public void setUp() throws Exception {
		ps = new String[] {
			")()()()(",
			"()))((()",
			"(()())()",
			")(",
			"()",
			"())(",
		};
		
		answers = new String[] {
			"(((())))",
			"()(())()",
			"(()())()",
			"()",
			"()",
			"()()",
		};
		parenthesesConversion = new ParenthesesConversion();
	}

	@Test
	public void test() {
		int index = 0;
		int range = ps.length;
		do {
			assertEquals(answers[index], parenthesesConversion.solution(ps[index]));
		} while(++index < range);
	}

}
