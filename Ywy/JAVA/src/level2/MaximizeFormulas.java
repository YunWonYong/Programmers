package level2;

import java.util.ArrayList;
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
		if (operList.size() == 1) {
			return singleOperCalc(expression, operList.get(0));
		}
		return multiOperCalc(operList, expression);
	}
	
	private long singleOperCalc(String expression, Operators operator) {
		String[] digits = expression.split(operator.getSlitCharator());
		int index = 0;
		int range = digits.length;
		Long answer = Long.parseLong(digits[index++]);
		do {
			answer = operator.calc(answer, digits[index]);
		} while(++index < range);
		return abs(answer);
	}
	
	private long multiOperCalc(List<Operators> operList, String expression) {
		Long answer = 0L;
		Long temp = 0L;
		String[][] patterns = getPatterns(operList);
		int index = 0;
		int range = patterns.length;
		do {
			temp = calc(patterns[index], expression); 
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
		
		String[][] patterns = new String[size][range];
		int pointer = 0;
		String[] pattern = new String[range];
		while(pointer < range) {
			pattern[pointer] = opers.get(pointer++);
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
	
	private Long calc(String[] patterns, String expression) {
		int index = 0;
		int range = patterns.length;
		String temp = null;
		String[] arr = null;
		Operators op = null;
		String operator = null;
		String splitAt = null;
		int min = 0;
		do {
			operator = patterns[index];
			op = Operators.getOperator(operator);
			splitAt = op.getSlitCharator();
			while((min = expression.indexOf(operator)) > -1) {
				if (min == 0) {
					min = expression.substring(1, expression.length()).indexOf(operator) + 1;
					if (min == 0) {
						break;
					}
				}
				temp = search(expression, min, operator);
				if (operator.equals("-") && temp.indexOf("-") == 0 && temp.indexOf("*") == - 1 && temp.indexOf("+") == -1) {
					arr = temp.substring(1, temp.length()).split(splitAt);
					arr[0] = "-" + arr[0];
				} else {
					arr = temp.split(splitAt);
				}
				
				if (arr[0].isEmpty() || arr[1].isEmpty() || arr.length != 2) {
					break;
				}
				expression = expression.replace(temp, String.valueOf(op.calc(arr[0], arr[1])));
			}
		} while(++index < range);
		return abs(Long.parseLong(expression));
	}

	private String search(String expression, int min, String operator) {
		StringBuffer sb = new StringBuffer();
		int temp = min - 1;
		if (expression.charAt(temp) < 48) {
			temp--;
		}
		int range = expression.length();
		boolean flag = true;
		char at = 0_0;
		while(true) {
			at = expression.charAt(temp);

			if ((flag && at < 48) || temp == 0) {
				sb.append(expression.substring(temp == 0 ? 0 : temp + 1, min)).append(operator);
				temp = min + 1;
				if (expression.charAt(temp) < 48) {
					temp++;
				}
				flag = false;
				continue;
			}
			temp += flag ? -1 : 1; 
			if ((!flag && at < 48) || temp == range) {
				sb.append(expression.substring(min + 1, temp == range ? temp : temp - 1));
				return sb.toString().replaceAll("#", operator);
			}
			
		}
	}
	
	
	private long abs(Long num) {
		return num < 0 ? ~num + 1: num;
	}
}
