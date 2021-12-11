package ywy.java.level1.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.Budget;

public class BudgetTest {
	private int[][] ds;
	private int[] budgets;
	private int[] answer;
	private Budget budget;
	@Before
	public void setUp() throws Exception {
		ds = new int[][] {
				{1,3,2,5,4},
				{2,2,3,3},
		};
		budgets = new int[]{
				9, 10
		};
		answer = new int[] {3, 4};
		budget = new Budget();
	}

	@Test
	public void test() {
		int index = 0;
		int range = ds.length;
		do {
			int answer = budget.solution(ds[index],  budgets[index]);
			assertTrue(this.answer[index] == answer);
		} while(++index < range);
	}

}
