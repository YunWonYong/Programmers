package level1.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.PhoneNumberMasking;

public class PhoneNumberMaskingTest {
	private String[] phoneNumbers;
	private String[] answers;
	private PhoneNumberMasking PhoneNumberMasking;
	
	@Before
	public void setUp() throws Exception {
		phoneNumbers = new String[]{
			"01033334444",
			"027778888"
		};
		answers = new String[] {
			"*******4444",
			"*****8888"	
		};
		PhoneNumberMasking = new PhoneNumberMasking();
	}

	@Test
	public void test() {
		int index = 0;
		int range = phoneNumbers.length;
		String result = null;
		do {
			result = PhoneNumberMasking.solution(phoneNumbers[index]);
			assertEquals(String.format("answer: %s, result: %s", answers[index], result), result, answers[index]);
		} while((++index) < range);
	}
}
