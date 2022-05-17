package boj.boj2579;

import java.util.*;
import java.lang.*;
import java.io.*;

//백준, 2579, 계단 오르기
class Main
{
	public static final int CONTINUE = 0;
	public static final int JUMP = 1;
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));     
		
		int m = Integer.parseInt(reader.readLine());
		int[] step = new int[m];
		int[][] arr = new int[2][m];

		for(int i=0;i<m;i++) {
			step[i] = Integer.parseInt(reader.readLine());
		}

		if(m<2) {
			System.out.println(Arrays.stream(step).sum());
			return;
		}
		
		arr[CONTINUE][0] = step[0];
		arr[CONTINUE][1] = step[0] + step[1];
		arr[JUMP][0] = 0;
		arr[JUMP][1] = step[1];
		
		for(int i=2;i<m;i++) {
			arr[CONTINUE][i] = step[i] + arr[JUMP][i-1];
			arr[JUMP][i] = step[i] + Math.max(arr[CONTINUE][i-2],arr[JUMP][i-2]);
		}

		System.out.println(Math.max(arr[CONTINUE][m-1],arr[JUMP][m-1]));
	}
	
}