package level1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.test.CaesarCipher;

public class CaesarCipherTest {
	private String[] s;
	private int[] n;
	private String[] answers;
	private CaesarCipher caesar;
	
	@Before
	public void setUp() throws Exception {
		s = new String[]{"AB", "z", "a B z"};
		n = new int[] {1, 1, 4};
		answers = new String[] {"BC", "a", "e F d"};
		caesar = new CaesarCipher();
	}
	
	@Test
	public void test() {
		for(int i=0; i<answers.length; i++) {
			assertEquals(caesar.solution(s[i], n[i]), answers[i]);
		}
	}
}
