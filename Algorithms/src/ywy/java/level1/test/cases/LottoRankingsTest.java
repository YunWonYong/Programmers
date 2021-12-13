package ywy.java.level1.test.cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.LottoRankings;

public class LottoRankingsTest {
	private int[][][] testCase;
	private LottoRankings lottoRankings;
	
	@Before
	public void setup() {
		testCase = new int[][][]{
			{
				{44, 1, 0, 0, 31, 25},
				{31, 10, 45, 1, 6, 19},
				{3, 5}
			},
			{
				{0, 0, 0, 0, 0, 0},
				{38, 19, 20, 40, 15, 25},
				{1, 6}
			},
			{
				{45, 4, 35, 20, 3, 9},
				{20, 9, 3, 45, 4, 35},
				{1, 1}
			}
		};
		lottoRankings = new LottoRankings();
	}
	@Test
	public void solutionTest() {
		int index = 0;
		int range = testCase.length;
		int[][] testData = null;
		int[] lottos = null;
		int[] winNumbers = null;
		int[] result = null;
		do {
			testData = testCase[index];
			lottos = testData[0];
			winNumbers = testData[1];
			result = lottoRankings.solution(lottos, winNumbers);
			assertArrayEquals(result, testData[2]);
		} while((++index) < range);
	}
}
