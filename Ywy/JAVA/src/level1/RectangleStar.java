package level1;

import java.util.Scanner;

public class RectangleStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while(true) {
			if (a-- > 0) {
				sb.append("*");
				continue;
			}
			
			System.out.println(sb.toString());
			
			if (--b == 0) {
				sc.close();
				return;
			}
		}
	}
}
