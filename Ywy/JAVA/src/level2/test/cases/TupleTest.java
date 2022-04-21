package level2.test.cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level2.Tuple;

public class TupleTest {
	private String[] inputs;
	private int[][] answers;
	private Tuple tuple;
	@Before
	public void setUp() throws Exception {
		inputs = new String[] {
			"{{2},{2,1},{2,1,3},{2,1,3,4}}",
			"{{1,2,3},{2,1},{1,2,4,3},{2}}",
			"{{20,111},{111}}",
			"{{123}}",
			"{{4,2,3},{3},{2,3,4,1},{2,3}}"
		};
		answers = new int[][] {
			{2, 1, 3, 4},
			{2, 1, 3, 4},
			{111, 20},
			{123},
			{3, 2, 4, 1}
		};
		
		tuple = new Tuple();
	}

	@Test
	public void test() {
		int index = 0;
		int range = inputs.length;
		int[] result = null;
		int[] answer = null;
		do {
			result = tuple.solution(inputs[index]);
			answer = answers[index];
			assertArrayEquals(result, answer);
		} while((++index) < range);
	}

}
