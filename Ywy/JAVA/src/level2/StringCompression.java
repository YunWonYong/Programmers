package level2;

import semantics.Choice;

final class Compression {
	private final StringBuffer BUFFER;
	private final String INPUT;
	private int inputSize;
	private int compressionSize;
	private int positionPoint;
	private int subStrBeginIndex;
	private int subStrEndIndex;
	
	public Compression(String input) {
		INPUT = input;
		BUFFER = new StringBuffer();
	}
	
	public Compression setUp() {
		inputSize = INPUT.length();
		compressionSize = inputSize;
		positionPoint = (inputSize / 2);
		subStrEndIndex = positionPoint;
		return this;
	}
	
	public int compression() {
		String matchedStr = getFirstMatchedStr();
		while (true) {
			if (matchedStr == null) {
				compressionSize = bufferFlush().result();
				if (positionPoint <= 0) {
					return compressionSize;
				}
				matchedStr = bufferClear().getFirstMatchedStr();
				continue;
			}
			matchedStr = matchingSearch(matchedStr);
		}
	}
	
	private String matchingSearch(String matchedStr) {
		String nextStr = null;
		int matchingCount = 1;
		while (true) {
			nextStr = getNextStr();
			if (matchedStr.equals(nextStr)) {
				matchingCount++;
				continue;
			}
			return unmatched(matchingCount, matchedStr, nextStr);
		}
	}
	
	private String unmatched(int matchingCount, String matchedStr, String nextStr) {
		if (matchingCount > 1) {
			BUFFER.append(matchingCount);
		}
		BUFFER.append(matchedStr);
		return nextStr;
	}
	
	private String getFirstMatchedStr() {
		subStrEndIndex = positionPoint;
		return getMatchedStr(0, subStrEndIndex);
	}
	
	private String getNextStr() {
		return substringPointCheck() ? getMatchedStr(subStrBeginIndex, subStrEndIndex) : null;
	}

	private boolean substringPointCheck() {
		subStrBeginIndex = subStrEndIndex;
		subStrEndIndex += positionPoint;
		return subStrEndIndex <= inputSize ? true : false;
	}
	
	private String getMatchedStr(int begin, int end) {
		String subStr = INPUT.substring(begin, end);
		return isNullOrBlank(subStr) ? null : subStr;
	}
	
	private int result() {
		int bufferSize = BUFFER.length();
		--positionPoint;
		return compressionSize < bufferSize ? compressionSize : bufferSize;
	}
	
	private Compression bufferFlush() {
		if (subStrEndIndex - positionPoint < inputSize) {
			BUFFER.append(INPUT.substring(subStrEndIndex - positionPoint, inputSize));
		}
		return this;
	}
	
	private Compression bufferClear() {
		BUFFER.replace(0, inputSize, "");
		return this;
	}
	
	private boolean isNullOrBlank(String subStr) {
		return isNull(subStr) || subStr.isEmpty();
	}
	
	private boolean isNull(String subStr) {
		return subStr == null;
	}
	
}

public class StringCompression {
	
	public int solution(String s) {
		int size = s.length();
		if (size < 3) {
			return size;
		}
		
		int currentPosition = size / 2;
		int subBeginIndex = 0;
		int subEndIndex = currentPosition;
		int matchedCount = 1;
		String matchedStr = s.substring(0, currentPosition);
		String nextStr = null;
		StringBuffer sb = new StringBuffer();
		int sbSize = sb.length();
		int minSize = size;
		while (true) {
			if (subEndIndex + currentPosition > size) {
				if (matchedCount > 1) {
					sb.append(matchedCount);
					matchedCount = 1;
				}
				sb.append(matchedStr);
				sbSize = sb.length();
				
				if (subBeginIndex + currentPosition < size) {
					sb.append(s.substring(subBeginIndex + currentPosition , size));
					sbSize = sb.length();
				}
				 
				if (minSize > sbSize) {
					minSize = sbSize;
				}
				currentPosition--;
				
				
				if (currentPosition == 0) {
					return minSize;
				}
				
				subEndIndex = currentPosition;
				matchedStr = s.substring(0, currentPosition);
				sb.replace(0, sbSize, "");
				continue;
			}

			subBeginIndex = subEndIndex;
			subEndIndex += currentPosition;
			
			nextStr = s.substring(subBeginIndex, subEndIndex);
			if (matchedStr.equals(nextStr)) {
				matchedCount++;
				continue;
			}
			
			if (matchedCount > 1) {
				sb.append(matchedCount);
				matchedCount = 1;
			}
			sb.append(matchedStr);
			matchedStr = nextStr;
		}
	}
	
	@Choice
	public int solution2(String s) {
		return new Compression(s).setUp().compression();
	}
}
