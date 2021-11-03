package ywy.java.level1;

import java.util.HashMap;
import java.util.Map;

public class UnfinishedPlayer {
	public String solution(final String[] participants, final String[] completions) {
		final Map<String, Integer> participantList = getParticipantList(participants);
		String completion = null;
		int index = 0;
		int range = completions.length;
		Integer temp = null;
		
		do {
			completion = completions[index];
			temp = participantList.get(completion);
			if (temp == null) {
				return completion;
			}
			temp--;
			if (temp == 0) {
				participantList.remove(completion);
				continue;
			}
			participantList.put(completion, temp); 
		} while((++index) < range);
		return participantList.keySet().iterator().next();
	}
	
	private Map<String, Integer> getParticipantList(final String[] participants) {
		final Map<String, Integer> participantList = new HashMap<String, Integer>();
		int index = 0;
		int range = participants.length;
		String participant = null;
		do {
			participant = participants[index];
			participantList.put(participant, participantList.getOrDefault(participant, 0) + 1);
		} while((++index) < range);
		return participantList;
	}
}
