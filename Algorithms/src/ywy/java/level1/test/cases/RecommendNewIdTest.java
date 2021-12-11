package ywy.java.level1.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.RecommendNewId;

public class RecommendNewIdTest {
	private String[][] ids;
	private RecommendNewId recommendNewId;
	@Before
	public void setUp() throws Exception {
		ids = new String[][]{
				{
					"...!@BaT#*..y.abcdefghijklm", 
					"bat.y.abcdefghi"
				},
				{
					"z-+.^.",
					"z--"
				},
				{
					"....$.@............................",
					"aaa"
				},
				{
					"123_.def",
					"123_.def"
				},
				{
					"abcdefghijklmn.p",
					"abcdefghijklmn"
				},
				{
					"#$#@!%@!^!@#%!%#@$",
					"aaa"
				},
				{
					"....116123,,12...51..23#@#@!%$s>>>....dasd12@#@$@$...",
					"11612312.51.23s"
				}
		};
		recommendNewId = new RecommendNewId();
	}

	@Test
	public void test() {
		int index = 0;
		int range = ids.length;
		String[] id = null;
		String result = null;
		do {
			id = ids[index];
			result = recommendNewId.solution(id[0]);
			assertEquals("success: "+ id[1] + ", result: " + result, result, id[1]);
		} while((++index) < range);
	}

}
