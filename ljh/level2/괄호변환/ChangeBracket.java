package Programmers.test;

/**
 * 괄호 변환 (60058)
 */
public class ChangeBracket {
    public String solution(String p) {
        return change(p);
    }

    public String change(String s) {
        int Point = searchBalance(s);
        String u = s.substring(0, Point);
        String v = s.substring(Point);

        if (checkCorrectness(u)) {
            return v.length() == 0 ? u : u + change(v);
        }

        StringBuffer sb = new StringBuffer();
        if (u.length() > 2) {
            for (int i = 1; i < u.length() - 1; i++) {
                sb.append(reverse(u.charAt(i)));
            }
        }
        return "(" + change(v) + ")" + sb.toString();
    }

    // 올바른 괄호 문자열인가?
    public boolean checkCorrectness(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) == '('? 1 : -1;
            if(sum < 0) {
                return false;
            }
        }
        return true;
    }

    // 균형잡힌 괄호 문자열이 처음 되는 순간 index + 1
    public int searchBalance (String s) {
        int sum = 0;
        int i;
        for (i = 0; i < s.length(); i++) {
            sum += s.charAt(i) == '('? 1 : -1;
            if(sum == 0) {
                return i + 1;
            }
        }
        return i;
    }

    // 괄호 방향 뒤집기
    public char reverse(char c) {
        return c == '('? ')' : '(';
    }

}
