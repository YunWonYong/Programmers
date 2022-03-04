package level2;

class IntStack {
	private int[] arr;
	private int top;
	private long capacity;
	
	public IntStack(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
	}
	
	public void push(int el) {
		if (top == arr.length) {
			expend(el);
			return;
		}
		arr[top++] = el;
	}
	
	public void pop() {
		top--;
	}
	
	public boolean topElementEquals(int el) {
		return top > 0 ? arr[top - 1] == el: false;
	}
	
	public boolean isEmpty() {
		return top == 0;
	}

	private void expend(int el) {
		int[] temp = arr;
		this.capacity *= capacity;
		arr = new int[(int)this.capacity];
		int index = 0;
		do {
			arr[index] = temp[index];
		} while(index < top);
		arr[top] = el;
		
	}
	
}

public class PairRemove {
	public int solution(final String s) {
		int range = s.length();
		int index = 0;
		int at = 0_0;
		IntStack stack = new IntStack(range);
		do {
			at = s.charAt(index);
			if (stack.topElementEquals(at)) {
				stack.pop();
				continue;
			}
			stack.push(at);
		} while(++index < range);
		return stack.isEmpty()? 1: 0;
	}
}
