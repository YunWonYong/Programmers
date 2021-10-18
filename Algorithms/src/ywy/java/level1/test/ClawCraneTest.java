package ywy.java.level1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.ClawCrane;

public class ClawCraneTest {
	private int[][][] moves;
	private int[][][] boards;
	private ClawCrane clawCrane;
	@Before
	public void setUp() throws Exception {
		boards = new int[][][] {
//			{
//				{0,0,0,0,0},
//				{0,0,1,0,3},
//				{0,2,5,0,1},
//				{4,2,4,4,2},
//				{3,5,1,3,1}
//			},
//			{
//				{0,0,0,0,0},
//				{7,7,1,0,3},
//				{6,6,5,0,1},
//				{5,5,4,4,2},
//				{3,3,1,3,1}
//			},
			{
				{2,1,0,0,0},
				{2,1,1,0,3},
				{2,1,5,0,1},
				{2,1,4,4,2},
				{2,1,1,3,1}
			}
		};
		moves = new int[][][] {
//			{
//				{1, 5, 3, 5, 1, 2, 1 ,4},{4}
//			},
//			{
//				{1, 2, 1, 2, 1, 2, 1 ,2},{8}
//			},
			{
				{1, 2, 1, 2, 1, 2, 1 ,2},{0}
			}
		};
		clawCrane = new ClawCrane();
	}

	@Test
	public void test() {
		int index = 0;
		int range = boards.length;
		int result = -1;
		int[][] board = null;
		int[][] move = null;
		do {
			board = boards[index];
			move = moves[index];
			result = clawCrane.solution(board, move[0]);
			assertEquals("success: " + move[1][0] + ", result: " + result, result, move[1][0]);
		} while((++index) < range);
		
	}

}
