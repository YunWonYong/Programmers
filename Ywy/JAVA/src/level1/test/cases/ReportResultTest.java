package level1.test.cases;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

import level1.ReportResult;

public class ReportResultTest {
	private String[][] ids;
	private String[][] reports;
	private int[] ks;
	private int[][] answers;
	private ReportResult reportResult;
	@Before
	public void setUp() throws Exception {
		ids = new String[][]{
			{
				"aab", "aa", "ab"
			},
			{
				"aaa", "bbb", "ccc", "ddd", "aa", "bb", "cc", "dd"
			},
			{
				"con", "ryan"
			},
			{
				"con", "ryan"
			},
			{
				"muzi", "frodo", "apeach", "neo"
			},
		};
		
		reports = new String[][]{
			{
				"aab aa", "aab aa", "aa ab", "ab aa"
			},
			{
				"aaa bbb", "bbb aaa", "ccc aaa", "ddd bbb", "aa bb", "bb aa", "cc dd", "dd cc"
			},
			{
				"ryan con", "ryan con", "ryan con", "ryan con"
			},
			{
				"ryan con", "con ryan"
			},
			{
				"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"
			},
		};
		
		ks = new int[] { 2, 3, 3, 1, 2, };
		
		answers = new int[][] {
			{1, 0, 1},
			{0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0},
			{1, 1},
			{2, 1, 1, 0},
		};
		reportResult = new ReportResult();
	}

	@Test
	public void test() {
		int index = 0;
		int range = ids.length;
		int[] result = null;
		do {
			result = reportResult.solution(ids[index], reports[index], ks[index]);
			assertArrayEquals("success: "+ Arrays.toString(answers[index]) + ", result: " + Arrays.toString(result), result, answers[index]);
		} while((++index) < range);
	}
}
