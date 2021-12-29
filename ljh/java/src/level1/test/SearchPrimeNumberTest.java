package level1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.SearchPrimeNumber;

public class SearchPrimeNumberTest {

	private int[] s;
	private int[] answers;
	private SearchPrimeNumber searchPrimeNumber;
	
	@Before
	public void setUp() throws Exception {
		s = new int[] {10, 5};
		answers = new int[] {4, 3};
		searchPrimeNumber = new SearchPrimeNumber();
	}
	
	@Test
	public void test() {
		for(int i=0; i<answers.length; i++) {
			assertEquals(searchPrimeNumber.solution(s[i]), answers[i]);
		}
		
	}
}
