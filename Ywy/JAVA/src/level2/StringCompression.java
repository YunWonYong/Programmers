package level2;

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

}
