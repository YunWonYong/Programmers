package ywy.java.level1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.RecommendNewId;
import ywy.java.level1.UnfinishedPlayer;

public class UnfinishedPlayerTest {
	private String[][] participantList;
	private String[][] completionList;
	private String[] result;
	private UnfinishedPlayer unfinishedPlayer;
	@Before
	public void setUp() throws Exception {
		participantList = new String[][]{
				{
					"leo", "kiki", "eden"
				},
				{
					"marina", "josipa", "nikola", "vinko", "filipa"
				},
				{
					"mislav", "stanko", "mislav", "ana"
				}
		};
		completionList = new String[][] {
			{
				"eden", "kiki"
			},
			{
				"josipa", "filipa", "marina", "nikola"
			},
			{
				"stanko", "ana", "mislav"
			}
		};
		result = new String[] {"leo", "vinko", "mislav"};
		unfinishedPlayer = new UnfinishedPlayer();
	}

	@Test
	public void test() {
		int index = 0;
		int range = participantList.length;
		String[] participants = null;
		String[] completions = null;
		String result = null;
		do {
			participants = participantList[index];
			completions = completionList[index];
			result = unfinishedPlayer.solution(participants, completions);
			assertEquals("success: "+ this.result[index] + ", result: " + result, result, this.result[index]);
		} while((++index) < range);
	}

}
