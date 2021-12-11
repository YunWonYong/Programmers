package ywy.java.level1.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.DartsGame;

public class DartsGameTest {
	private String[] dartResult;
	private int[] result;
	private DartsGame dartsGame;
	
	@Before
	public void setUp() throws Exception {
		dartResult = new String[] {
			"1S*2D*3T*",
			"1S2D*3T*",
			"1D2S#10S",
			"1S2D*3T",
			"1D2S0T",
			"1S*2T*3S",
			"1D#2S*3S",
			"1T2D3D#",
			"1D2S3T*"
		};
		
		result = new int[] {
			74,
			72,
			9,
			37,
			3,
			23,
			5,
			-4,
			59
		};
		
		dartsGame = new DartsGame();
	}

	@Test
	public void test() {
		int index = 0;
		int range = result.length;
		int answer = -1;
		do {
			answer = dartsGame.solution(dartResult[index]);
			assertTrue(String.format("testCase[%d]: %s, %d != %d", index+1, dartResult[index], answer, result[index]), answer == result[index]);
		} while(++index < range);
	}

}
