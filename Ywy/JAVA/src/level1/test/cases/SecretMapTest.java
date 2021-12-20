package level1.test.cases;


import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level1.SecretMap;

public class SecretMapTest {
	private int[] sizes;
	private int[][] arrs;
	private String[][] result;
	private SecretMap scretMap;

	@Before
	public void setUp() throws Exception {
		sizes = new int[] {5, 6};
		arrs = new int[][] {
			{9, 20, 28, 18, 11},
			{30, 1, 21, 17, 28},
			{46, 33, 33, 22, 31, 50},
			{27, 56, 19, 14, 14, 10}
		};
		result = new String[][] {
			{"#####", "# # #", "### #", "#  ##", "#####"},
			{"######", "### #", "## ##", " #### ", " #####", "### # "}
		};
		scretMap = new SecretMap();
	}

	@Test
	public void test() {
		int index = 0;
		int resultIndex = 0;
		int range = sizes.length;
		String[] result = null;
		do {
			result = scretMap.solution(sizes[index], arrs[index++], arrs[index]);
			assertArrayEquals(result, this.result[resultIndex++]);
		} while(++index < range);
	}

}
