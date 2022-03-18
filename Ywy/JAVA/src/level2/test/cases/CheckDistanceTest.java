package level2.test.cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level2.CheckDistance;

public class CheckDistanceTest {
	private String[][][] places;
	private int[][] answers;
	private CheckDistance checkDistance;
	@Before
	public void setUp() throws Exception {
		places = new String[][][] {
			{
				{
					"POOOP", 
					"OXXOX", 
					"OPXPX", 
					"OOXOX", 
					"POXXP"
				},
				{
					"POOPX", 
					"OXPXP", 
					"PXXXO", 
					"OXXXO", 
					"OOOPP"
				},
				{
					"PXOPX", 
					"OXOXP", 
					"OXPOX", 
					"OXXOP", 
					"PXPOX"
				},
				{
					"OOOXX", 
					"XOOOX", 
					"OOOXX", 
					"OXOOX", 
					"OOOOO"
				},
				{
					"PXPXP", 
					"XPXPX", 
					"PXPXP", 
					"XPXPX", 
					"PXPXP"
				},
			}
			
		};
		answers = new int[][] {
			{1, 0, 1, 1, 1}
		};
		
		checkDistance = new CheckDistance();
	}

	@Test
	public void test() {
		int index = 0;
		int range = places.length;
		int[] result = null;
		do {
			result = checkDistance.solution(places[index]);
			assertArrayEquals("success: "+ answers[index] + ", result: " + result, result, answers[index]);
		} while((++index) < range);
	}

}
