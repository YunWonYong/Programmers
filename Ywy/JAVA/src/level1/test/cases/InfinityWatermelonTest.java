package level1.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import level1.InfinityWatermelon;

public class InfinityWatermelonTest {
	private int[] ns;
	private String[] answers;
	private InfinityWatermelon infinityWatermelon;
	
	@Before
	public void setUp() {
		ns = new int[] {
			2,
			3,
			5,
			1,
			8
		};
		answers = new String[] {
			"수박",
			"수박수",
			"수박수박수",
			"수",
			"수박수박수박수박"
		};
		infinityWatermelon = new InfinityWatermelon();
	}
	
	@Test
	public void test() {
		int index = 0;
		int range = answers.length;
		do {
			assertEquals(infinityWatermelon.solution(ns[index]), answers[index]);
		} while(++index < range);
	}

}
