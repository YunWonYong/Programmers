package level2;

public class ParenthesesConversion {
	private boolean isBalance = true;
	public String solution(String p) {
		if (p.length() == 2) {
			return "()";
		} else if (p.isEmpty()) {
			return "";
		}
		final StringBuffer sb = new StringBuffer();
		String str = null;
		while (true) {
			str = search(p);
			p = p.substring(str.length());
			if (isBalance) {
				sb.append(str);
				sb.append(solution(p));
				return sb.toString();
			}
			str = str.substring(1, str.length() - 1);
			sb.append("(");
			sb.append(solution(p));
			sb.append(")");
			sb.append(reversal(str));
			return sb.toString();
		}
	}
	
	private String search(String p) {
		isBalance = false;
		char[] parentheses = p.toCharArray();
		int index = 0;
		int range = parentheses.length - 1;
		int leftCount = 0;
		int rightCount = 0;
		char current = ' ';
		char next = ' ';
		do { 
			current = parentheses[index++];
			next = parentheses[index];
			
			if (current == '(') {
				leftCount++;
			} else if (current == ')') {
				rightCount++;
			}
			
			if (next == '(') {
				leftCount++;
			} else if (next == ')') {
				rightCount++;
			}
			
			if (rightCount == leftCount) {
				index = rightCount + leftCount;
				break;
			}
		} while(++index < range);
		range = index;
		index = 0;
		char[] result = new char[range];
		char[] stack = new char[range];
		int top = 0;
		current = ' ';
		while (index < range) {
			next = parentheses[index];
			result[index++] = next;
			if (current == '(' && next == ')') {
				top += top > 0 ? -1 : 0;
				current = stack[top];
				continue;
			}
			stack[top++] = next;
			current = next;
		}
		
		if (top == 0) {
			isBalance = true;
		}
		return new String(result);
	}
	
	private String reversal(String p) {
		char[] parentheses = p.toCharArray();
		int index = 0;
		int range = p.length();
		char at = ' ';
		while (index < range) {
			at = parentheses[index];
			parentheses[index++] =  at == '(' ? ')' : '(';
		}
		return new String(parentheses);
	}
}
