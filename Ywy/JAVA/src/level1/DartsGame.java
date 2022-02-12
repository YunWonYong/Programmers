package level1;

import java.util.regex.Pattern;

enum ScoreChars {
	SINGLE(0),
	DOUBLE(1),
	TRIPLE(2);
	private final int num;
	ScoreChars(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public static int getNum(String token) {
		ScoreChars scoreChars = null;
		switch (token) {
		case "S":
			scoreChars = ScoreChars.SINGLE;
			break;
		case "D":
			scoreChars = ScoreChars.DOUBLE;
			break;
		case "T":
			scoreChars = ScoreChars.TRIPLE;
			break;
		}
		return scoreChars == null ? 0 : scoreChars.getNum();
	}
}
class Calculator {
	private String[] tokens;
	protected Calculator(String[] tokens) {
		this.tokens = tokens;
	}
	
	public int calc() {
		int index = 0;
		int range = tokens.length;
		String token = null;
		int num = 0;
		int numbersIndex = 0;
		int[] table = new int[range + 1];
		table[numbersIndex++] = 0;
		do {
			token = tokens[index];
			if (Pattern.matches("[0-9]{1,}", token)) {
				num = Integer.parseInt(token);
				continue;
			}
			if (token.equals("*")) {
				astarCalc(table, numbersIndex - 1);
				continue;
			} else if (token.equals("#")) {
				hashCalc(table, numbersIndex - 1);
				continue;
			} 
			table[numbersIndex++] = pow(num, ScoreChars.getNum(token));
		} while(++index < range);
		return result(table, numbersIndex);
	}
	
	private void hashCalc(int[] table, int index) {
		table[index] = (~table[index]) + 1; 
	}

	private void astarCalc(int[] table, int range) {
		int index = range;
		while(index > range - 2) {
			table[index] = table[index--] * 2;
		}
	}
	
	private int pow(int number, int squared) {
		int num = number;
		while(squared > 0) {
			num = num * number;
			squared--;
		}
		return num;
	}

	private int result(int[] table, int range) {
		int index = 0;
		int num = 0;
		while(index < range) {
			num += table[index++];
		}
		return num;
	}
}

class TokenCalculator{
	private String dartResult;
	
	public TokenCalculator(String dartResult) {
		this.dartResult = dartResult;
	}
	
	public Calculator split(){
		StringBuffer sb = new StringBuffer();
		String[] chars = dartResult.split("");
		int index = 0;
		int range = chars.length;
		String c = null;
		while(true) {
			c = chars[index++];
			if (Pattern.matches("[SDT]", c)) {
				sb.append(",");
			}
			sb.append(c);
			if (index == range) {
				return new Calculator(sb.toString().replace("[\\s]{1,}", "").replace("[\\,]{1,}", ",").trim().split(","));
			} else if (Pattern.matches("[^0-9]", c)) {
				sb.append(",");
			}
		}
	}
}

public class DartsGame {
    public int solution(String dartResult) {
        return new TokenCalculator(dartResult).split().calc();
    }
}
