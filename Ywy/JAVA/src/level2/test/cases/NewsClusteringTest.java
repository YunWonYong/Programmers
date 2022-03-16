package level2.test.cases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import level2.NewsClustering;

public class NewsClusteringTest {
	private String[][] strs;
	private int[] answers;
	private NewsClustering newsClustering;
	@Before
	public void setUp() throws Exception {
		strs = new String[][] {
			{"FRANCE", "french"},
			{"handshake", "shake hands"},
			{"aa1+aa2", "AAAA12"},
			{"E=M*C^2", "e=m*c^2"},
		};
		answers = new int[] {
			16384,
			65536,
			43690,
			65536
		};
		
		newsClustering = new NewsClustering();
	}

	@Test
	public void testSolution() {
		int index = 0;
		int range = strs.length;
		long result = 0;
		do {
			result = newsClustering.solution(strs[index][0], strs[index][1]);
			assertTrue(result == answers[index]);
		} while((++index) < range);
	}
}
