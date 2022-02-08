package level2.test.cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import level2.OpenChatRoom;

public class OpenChatRoomTest {
	private String[][] inputs;
	private String[][] answers;
	private OpenChatRoom openChatRoom;
	@Before
	public void setUp() throws Exception {
		inputs = new String[][] {
			{
				"Enter uid1234 Muzi", 
				"Enter uid4567 Prodo",
				"Leave uid1234",
				"Enter uid1234 Prodo",
				"Change uid4567 Ryan"
			}
		};
		answers = new String[][] {
			{
				"Prodo님이 들어왔습니다.", 
				"Ryan님이 들어왔습니다.", 
				"Prodo님이 나갔습니다.", 
				"Prodo님이 들어왔습니다."
			}
		};
		
		openChatRoom = new OpenChatRoom();
	}

	@Test
	public void test() {
		int index = 0;
		int range = inputs.length;
		String[] result = null;
		do {
			result = openChatRoom.solution(inputs[index]);
			assertArrayEquals("success: "+ answers[index] + ", result: " + result, result, answers[index]);
		} while((++index) < range);
	}

}
