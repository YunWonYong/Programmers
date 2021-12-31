package level1.test.cases;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.CaesarCipher;

public class CaesarCipherTest {
	private String[] s;
	private int[] ns;
	private String[] answers;
	private CaesarCipher caesarCipher;
	
	@Before
	public void setUp() throws Exception {
		s = new String[] {
			"AB",
			"z",
			"a B z"
		};
		
		ns = new int[] {
			1,
			1,
			4
		};
		
		answers = new String[] {
			"BC",
			"a",
			"e F d"
		};
		
		caesarCipher = new CaesarCipher();
	}

	@Test
	public void test() {
		int index = 0;
		int range = s.length;
		do {
			assertEquals(caesarCipher.solution(s[index], ns[index]), answers[index]);
		} while(++index < range);
	}

}
