package level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;

enum Operators {
	PLUS("+", (left, right) -> left + right),
	MINUS("-", (left, right) -> left - right),
	MULTIPLY("*", (left, right) -> left * right);
	
	private String operator;
	private BiFunction<Long, Long, Long> expression;
	
	Operators(String operator, BiFunction<Long, Long, Long> expression) {
		this.operator = operator;
		this.expression = expression;
	}
	
	public long calc(String leftOper, String rightOper) {
		return calc(Long.parseLong(leftOper), rightOper);
	}
	
	public long calc(Long leftOper, String rightOper) {
		return this.expression.apply(leftOper, Long.parseLong(rightOper));
	}
	
	
	public String getOperator() {
		return this.operator;
	}
	
	public String getSlitCharator() {
		switch (operator) {
		case "+":
			return "\\+";
		case "-":
			return "\\-";
		case "*":
			return "\\*";
		}
		return null;
	}
	
	public static Operators getOperator(String operator) {
		switch (operator) {
		case "+":
			return Operators.PLUS;
		case "-":
			return Operators.MINUS;
		case "*":
			return Operators.MULTIPLY;
		}
		return null;
	}
}

public class MaximizeFormulas {
	public long solution(String expression) {
		List<Operators> operList = new ArrayList<>();
		
		for (Operators operator: Operators.values()) {
			if (expression.indexOf(operator.getOperator()) == -1) {
				continue;
			}
			operList.add(operator);
		}
		
		String[][] patterns = getPatterns(operList);
		int index = 0;
		int range = patterns.length;
		long answer = 0L;
		long temp = 0L;
		
		do {
			temp = calc(expression, patterns[index]);
			if (answer < temp) {
				answer = temp;
			}
		} while(++index < range);
		return answer;
	}

	private String[][] getPatterns(List<Operators> operList) {
		int range = operList.size();
		
		final List<String> opers = new ArrayList<>();
		
		operList.forEach(oper -> opers.add(oper.getOperator()));
		int size = range * (range - 1);
		if (size == 0) {
			size++;
		}
		String[][] patterns = new String[size][range];
		int pointer = 0;
		String[] pattern = new String[range];
		while(pointer < range) {
			pattern[pointer] = opers.get(pointer++);
		}
		if (size == 1) {
			patterns[0] = pattern;
			return patterns;
		}
		pointer = 0;
		int index = 1;
		int inputIndex = 0;
		patterns[inputIndex++] = pattern.clone();
		String current = pattern[pointer];
		while(true) {
			pattern[index - 1] = pattern[index];
			pattern[index++] = current;
			
			if (index == range && patterns[0][range - 1].equals(current)) {
				return patterns;
			}
			patterns[inputIndex++] = pattern.clone();
			if (index == range) {
				current = patterns[0][++pointer];
				index = 1;
			}
		}
	}
	
	private long calc(String expression, String[] operations) {
		int index = 0;
		int range = operations.length;
		String operation = null;
		Operators operator = null;
		List<String> numbers = new LinkedList<>();
		List<String> opers = new LinkedList<>();
		set(numbers, expression, "[^0-9]");
		set(opers, expression.replaceAll("[0-9]", ""), "");
		int index2 = 0;
		int range2 = opers.size();
		do {
			operation = operations[index];
			operator = Operators.getOperator(operation);
			while (index2 < range2) {
				if (operation.equals(opers.get(index2))) {
					numbers.set(index2, String.valueOf(operator.calc(numbers.get(index2), numbers.get(index2 + 1))));
					numbers.remove(index2 + 1);
					opers.remove(index2);
					range2--;
					continue;
				}
				index2++;
			}
			if (range2 == 0) {
				break;
			}
			index2 = 0;
		} while(++index < range);
		return abs(Long.parseLong(numbers.get(0)));
	}
	
	
	private void set(List<String> list, String expression, String reg) {
		String[] arr = expression.split(reg);
		int index = 0;
		int range = arr.length;
		do {
			list.add(arr[index]);
		} while(++index < range);
		
	}

	private long abs(Long num) {
		return num < 0 ? ~num + 1: num;
	}
}
