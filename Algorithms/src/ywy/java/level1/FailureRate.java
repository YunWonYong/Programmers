package ywy.java.level1;

public class FailureRate {

	public FailureRate() {
		// TODO Auto-generated constructor stub
	}

	public int[] solution(int n, int[] stages) {
		int[] users = setUserStage(new int[n], stages);
		int[] answer = new int[n];
		double[] rates = new double[n];
		int range = users.length;
		int index = 0;
		int user = 0;
		int tryUsers = stages.length;
		do {
			user = users[index];
			if (user == 0) {
				rates[index] = 0.0;
				answer[index] = ++index;
				continue;
			}
			rates[index] = ((double)user)/ ((double)tryUsers);
			tryUsers -= user;
			answer[index] = ++index;
		} while (index < range);
		 answer = bubbleSort(answer, rates);
		return answer;
	}
	private int[] setUserStage(final int[] users, final int[] stages) {
		int index = 0;
		int range = stages.length;
		int n = users.length;
		int stage = 0;
		do {
			stage = stages[index];
			if (stage > n) {
				continue;
			}
			users[stage - 1]++;
		} while (++index < range);
		return users;
	}
	private int[] bubbleSort(final int[] answer, final double[] rates) {
		int index = 0;
		int range = answer.length - 1;
		double rate = 0.0;
		double nextRate = 0.0;
		int stage = 0;
		int nextStage = 0;
		while(index < range) {
			rate = rates[index];
			nextRate = rates[index + 1];
			if (rate < nextRate) {
				rates[index] = nextRate;
				rates[index + 1] = rate;
				stage = answer[index];
				nextStage = answer[index + 1];
				answer[index] = nextStage;
				answer[index + 1] = stage;
				if (index > 0) {
					index--;
				}
				continue;
			}
			index++;
		}
		return answer;
	}
}