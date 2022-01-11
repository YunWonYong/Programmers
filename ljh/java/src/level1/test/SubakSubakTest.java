package level1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.SubakSubak;

public class SubakSubakTest {

	private int[] n;
	private String[] answers;
	private SubakSubak subak;
	
	@Before
	public void setUp() throws Exception {
		n = new int[]{3, 4};
		answers = new String[] {"수박수", "수박수박"};
		subak = new SubakSubak();
	}
	
	@Test
	public void test() {
		for(int i=0; i<answers.length; i++) {
			assertEquals(subak.solution(n[i]),answers[i]);
		}
	}
	
}
