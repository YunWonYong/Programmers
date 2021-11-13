package ywy.java.level1;

import java.util.Arrays;

public class GymSuit {

	public GymSuit() {
		// TODO Auto-generated constructor stub
	}

	public int solution(int n, int[] lost, int[] reserve) {
		Arrays.sort(lost);
		Arrays.sort(reserve);
		int studentNum = 0;
		int answer = 0;
		int lostIndex = 0;
		int moveLostIndex = 0;
		int reserveIndex = 0;
		int moveReserveIndex = 0;
		while(studentNum++ < n) {
			lostIndex = indexOf(lost, studentNum);
			if (lostIndex > -1) {
				reserveIndex = indexOf(reserve, studentNum);
				if (reserveIndex > -1) {
					lost[lostIndex] = 999;
					reserve[reserveIndex] = 999;
					answer++;
					continue;
				}
				moveLostIndex = indexOf(lost, studentNum + 1);
				if (moveLostIndex > -1) {
					moveReserveIndex = indexOf(reserve, studentNum + 1);
					if (moveReserveIndex > -1 && lost[moveLostIndex] == reserve[moveReserveIndex]) {
						lost[moveLostIndex] = 999;
						reserve[moveReserveIndex] = 999;
						answer++;
						studentNum++;
					}
				}
				moveReserveIndex = indexOf(reserve, studentNum + 1);
				if (moveReserveIndex > -1) {
					moveLostIndex = indexOf(lost, studentNum + 1);
					if (moveLostIndex > -1 && lost[moveLostIndex] == reserve[moveReserveIndex]) {
						lost[moveLostIndex] = 999;
						reserve[reserveIndex] = 999;
						reserve[moveReserveIndex] = 999;
						answer++;
						studentNum++;
						continue;
					}
				}
				reserveIndex = borrow(lost[lostIndex], reserve);
				if (reserveIndex > -1) {
					lost[lostIndex] = 999;
					reserve[reserveIndex] = 999;
					answer++;
					continue;
				}
				continue;
			}
			answer++;
		}
		return answer;
	}
	
	public int indexOf(int[] arr, int studentNum) {
		int index = 0;
		int range = arr.length;
		do {
			if (studentNum == arr[index]) {
				return index; 
			}
		}while(++index < range);
		return -1;
	}
	
	public int borrow(int lostEl, int[] reserve) {
		int index = 0;
		int range = reserve.length;
		int reserveEl = 0;
		do {
			reserveEl = reserve[index];
			if (lostEl - 1 == reserveEl || lostEl + 1 == reserveEl) {
				return index;
			}
		} while(++index < range);
		return -1;
	}
}
