package level1;

public class DartGame {
	public int solution(String dartResult) {
		int count = 0;
		int[] arr = new int[3];
		boolean isNumber = false;
		int length = dartResult.length();

		for (int i = 0; i < length; i++) {
			Character kb = dartResult.charAt(i);

			if (kb >= 48 && kb <= 57) {
				// 숫자일때
				arr[count] = Character.getNumericValue(kb);
				if (isNumber == true) {
					arr[count] = 10;
				}
				isNumber = true;
			} else {
				// 숫자가 아닐때
				if (isNumber == true) {// 보너스 일때
					switch (kb) {
					case 83:
						// S 일때
						break;
					case 68:
						// D 일때
						arr[count] = (int) Math.pow(arr[count], 2);
						break;
					case 84:
						// T 일때
						arr[count] = (int) Math.pow(arr[count], 3);
					}
					count = count + 1;
				} else {// 옵션 일때
					if (kb == 42) {
						// *
						if (count > 1) {
							arr[count - 2] = arr[count - 2] * 2;
						}
						arr[count - 1] = arr[count - 1] * 2;
					} else if (kb == 35) {
						// #
						arr[count - 1] = -arr[count - 1];
					}
				}

				isNumber = false;
			}
		}

		int answer = 0;
		for (int j = 0; j < 3; j++) {
			answer = answer + arr[j];
		}
		return answer;
	}
}
