package level1.test;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import level1.SortMyWay;

public class SortMyWayTest {
	private String[][] strings; // 입력 string
	private String[][] answers; // 출력
	private int[] ns; // 입력 n 
	private SortMyWay sortMyWay;
	
	@Before
	public void setUp() throws Exception{
		strings = new String[][] {
			{"sun", "bed", "car"},
			{"abce", "abcd", "cdx"}
		};
		answers = new String[][] {
			{"car", "bed", "sun"},
			{"abcd", "abce", "cdx"}
		};
		ns = new int[] {1, 2};		
	}
	
	@Test
	public void test() {
		int index = 0;
		int range = strings.length;
		String[] result = null;
		
		sortMyWay = new SortMyWay();
		
		do {
			result = sortMyWay.solution(strings[index], ns[index]);
			assertArrayEquals(String.format("answer: %s, result: %s", Arrays.toString(answers[index]), Arrays.toString(result)), result, answers[index]);
		} while((++index) < range);
		
	}
}
