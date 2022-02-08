package level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@FunctionalInterface
interface State {
	public abstract String getMessage();
}

enum StateCode { 
	Enter(()-> "들어왔습니다."),
	Change(null),
	Leave(() -> "나갔습니다.");
	
	private State state;
	
	StateCode(State state) {
		this.state = state;
	}
	
	public State getStateInstance() {
		return state;
	}
}

final class User { 
	private String name;
	private final List<State> stateList;
	private int currentStateIndex;
	
	public User(String name) {
		this.name = name;
		this.stateList = new ArrayList<State>();
	}

	public void nameChange(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void addState(State state) {
		stateList.add(state);
	}
	
	@Override
	public String toString() {
		State state = stateList.get(currentStateIndex++);
		return String.format("%s님이 %s", name, state.getMessage());
	}
}

public class OpenChatRoom {
	public String[] solution(String[] record) {
		Map<String, User> room = new HashMap<>();
		List<User> queue = new ArrayList<>();
		String[] degree = null;
		String id = null;
		User user = null;
		int index = 0;
		int range = record.length;
		while (index < range) {
			degree = record[index++].split(" ");
			id = degree[1];
			user = room.get(id);
			switch (StateCode.valueOf(degree[0])) {
			case Enter:
				if (user == null) {
					user = new User(degree[2]);
					room.put(id, user);
					user = room.get(id);
				} else if (!user.getName().equals(degree[2])) {
					user.nameChange(degree[2]);
				}
				user.addState(StateCode.Enter.getStateInstance());
				break;
			case Change:
				user.nameChange(degree[2]);
				continue;
			case Leave:
				user.addState(StateCode.Leave.getStateInstance());
				break;
			}
			queue.add(user);
		}
		return getSignLog(queue);
	}
	
	private String[] getSignLog(List<User> userList) {
		int range = userList.size();
		final String[] log = new String[range];
		int index = 0;
		while (true) {
			log[index] = String.valueOf(userList.get(index++));
			if (index == range) {
				return log;
			}
		}
	}
}
