package ywy.level1;

import java.util.regex.Pattern;

public class NumberStrToNumber {
	public NumberStrToNumber() {}
	
	public int solution(String s) {
		StringBuffer temp = new StringBuffer();
		StringBuffer result = new StringBuffer();
		String[] tokens = s.toLowerCase().split("");
		int index = 0;
		int range = tokens.length;
		String token = null;
		String numStr = null;
		while (index < range) {
			token = tokens[index++];
			if (Pattern.matches("[0-9]", token)) {
				result.append(token);
				continue;
			}
			temp.append(token);
			numStr = sustitution(temp.toString());
			if (numStr != null) {
				result.append(numStr);
				temp.replace(0, temp.length(), "");
			}
		}
		return Integer.parseInt(result.toString());
	}

	public String sustitution(String s) {
		if (s == null) {
			return null;
		}
		switch (s) {
		case "zero":
			return "0";
		case "one" :
			return "1";
		case "two" :
			return "2";
		case "three" :
			return "3";
		case "four" :
			return "4";
		case "five" :
			return "5";
		case "six" :
			return "6";
		case "seven" :
			return "7";
		case "eight" :
			return "8";		
		case "nine":
			return "9";
		default:
			return null;
		}
	}
}
