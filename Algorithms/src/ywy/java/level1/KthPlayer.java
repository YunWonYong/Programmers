package ywy.java.level1;
class ArraySpliter {
	public static class Builder {
		private int[] array = null;
		private int from = -1;
		private int to = -1;
		public Builder() {
			this(null, -1, -1);
		}
		
		public Builder(int[] array) {
			this(array, -1, -1);
		}
		public Builder(int from, int to) {
			this(null, from, to);
		}
		public Builder(int[] array, int from, int to) {
			this.array = array;
			this.from = from;
			this.to = to;
		}
		public Builder setArray(int[] array) {
			this.array = array;
			return this;
		}
		
		public Builder setFrom(int from) {
			this.from = from;
			return this;
		}
		
		public Builder setTo(int to) {
			this.to = to;
			return this;
		}
		
		public ArraySpliter build() {
			int range = this.array.length;
			try {
				if (this.array == null || range == 0) {
					throw new IllegalArgumentException("array must be initialized.");
				} else if (this.from == -1) {
					throw new IllegalArgumentException("from must be initialized.");
				} else if (this.to == -1) {
					throw new IllegalArgumentException("to must be initialized.");
				} else if (this.from >= range) {
					throw new IndexOutOfBoundsException("from and range are the same");
				} else if (this.to > range) {
					throw new IndexOutOfBoundsException("to and range are the same");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new ArraySpliter(this);
		}
	}
	private Builder build;
	private int[] temp;
	private ArraySpliter() {};
	private ArraySpliter(Builder build) {
		this.build = build;
	}
	
	public ArraySpliter split() {
		int from = build.from;
		int to = build.to;
		int size = from - to;
		size = (size - (size * 2)) +1;
		this.temp = new int[size];
//		System.arraycopy(build.array, from, temp, 0, size);
		int index = 0;
		do {
			temp[index] = build.array[from]; 
			index++;
		} while((++from) <= to);
		return this;
	}
	
	public ArraySpliter sort() {
		int range = this.temp.length;
		int index = 0;
		int pre = -1;
		int next = -1;
		if (range > 1) {
			do {
				pre = get(index);
				next = get(index + 1);
				if (pre > next) {
					this.temp[index + 1] = pre;
					this.temp[index] = next;
					if (index > 0) {
						index--;
					}
					continue;
				}
				index++;
			} while(index < range -1);
		}
		return this;
	}
	
	public int get(int index) {
		return this.temp[index];
	}
}

public class KthPlayer {
	public int[] solution(int[] array, int[][] commands) {
		final int range = commands.length;
		int[] answer = new int[range];
		int[] command = null;
		int index = 0;
		ArraySpliter spliter = null;
		do {
			command = commands[index];
			spliter = new ArraySpliter.Builder().setArray(array).setFrom(--command[0]).setTo(--command[1]).build();
			answer[index] = spliter.split().sort().get(--command[2]);
		} while((++index) < range);
		return answer;
	}
}
