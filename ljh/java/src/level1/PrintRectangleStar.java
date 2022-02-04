package level1;

import java.util.Scanner;

/*
 *	직사각형 별 찍기 (220129 - 220204) 
 */

public class PrintRectangleStar {
	// 방법1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=0; i<b; i++) {
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//방법2
//	public static void main02(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		String s = "*".repeat(a) + "\n";
//		System.out.println(s.repeat(b));
//		}
//	}
}
