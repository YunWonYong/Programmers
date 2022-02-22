package level2;

import java.util.HashMap;
import java.util.Map;

class DevelopmentScheduleQueue<T> {
	private T[] array;
	private int capacity;
	private int front;
	private int size;
	
	@SuppressWarnings("unchecked")
	public DevelopmentScheduleQueue(int capacity) {
		this.capacity = capacity;
		this.size = capacity;
		this.array = (T[])new Object[capacity];
	}
	
	public void push(T element) {
		if (front == size) {
			expand();
		}
		array[front++] = element;
	}
	
	public T pop() {
		return array[--front];
	}
	
	public boolean isEmpty() {
		return front < 0;
	}
	
	public int size() {
		return front;
	}
	
	public int[] toIntArray() {
		final int[] array = new int[this.front];
		int index = front;
		while(--index > -1) {
			array[index] = (int) this.array[index];
		}
		return array;
	}
	
	private void expand() {
		this.capacity *= this.capacity;
		@SuppressWarnings("unchecked")
		T[] temp = (T[])new Object[this.capacity];
		int index = 0;
		do {
			temp[index] = array[index];
		} while(++index < front);
		array = temp;
	}
}

public class FunctionDevelopment {
	public int[] solution(int[] progresses, int[] speeds) {
		int count = 0;
		int max = 0;
		int index = 0;
		int range = progresses.length;
		int progress = 0;
		int speed = 0;
		Integer completionDay = 0;
		String key = null;
		Map<String, Integer> scheduleTable = new HashMap<>();
		DevelopmentScheduleQueue<Integer> queue = new DevelopmentScheduleQueue<Integer>(range);
		while (true) {
			progress = progresses[index];
			speed = speeds[index];
			key = String.format("%d_%d", progress, speed);
			completionDay = scheduleTable.get(key);
			if (completionDay == null) {
				completionDay = getCompletionDay(progress, speed);
				scheduleTable.put(key, completionDay);
				if (max == 0) {
					max = completionDay;
				}
				continue;
			}
			if (completionDay != null && completionDay > max) {
				queue.push(count);
				max = completionDay; 
				count = 0;
				continue;
			}
			count++;
			if (++index == range) {
				queue.push(count);
				return queue.toIntArray();
			}
		}
	}
	
	public int getCompletionDay(int progress, int speed) {
		int day = 0;
		while (true) {
			day++;
			progress += speed;
			if (progress >= 100) {
				return day;
			}
		}
	}
}
