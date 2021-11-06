package ywy.java.level1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.MakePrimeNumber;
import ywy.java.level1.RecommendNewId;
import ywy.java.level1.UnfinishedPlayer;

public class MakePrimeNumberTest {
	private int[][] nums;
	private int[] results;
	private MakePrimeNumber makePrimeNumber;
	@Before
	public void setUp() throws Exception {
		nums = new int[][]{
				{
					1,2,3,4
				},
				{
					1,2,7,6,4
				},
				{
					1,2,3,4,5,6,7,8,9,10
				}
		};
		results = new int[] {1, 4, 37};
		makePrimeNumber = new MakePrimeNumber();
	}

	@Test
	public void test() {
		int index = 0;
		int range = nums.length;
		int result = 0;
		do {
			result = makePrimeNumber.solution(nums[index]);
			assertEquals("success: "+ this.results[index] + ", result: " + result, result, this.results[index]);
			System.out.println("======================================");
		} while((++index) < range);
	}

}
