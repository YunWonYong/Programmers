package level1.java;
import java.util.Scanner;

//프로그래머스 Level 1,직사각형 별찍기
public class rectangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String str = "*".repeat(a) + "\n";
        System.out.println(str.repeat(b));
    }
}
