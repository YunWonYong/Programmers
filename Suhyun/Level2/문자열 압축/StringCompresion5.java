public class StringCompresion5 {
    public static void main(String[] args) {
        String s = "abcabcdede";

        int answer = s.length();
        // 결합 문자열
        String arr = new String();
        String current = "";
        boolean flag = true;

        for (int i = 1; i <= s.length() / 2; i++) {

            String temp = s.substring(0, i);
            int count = 1;

            for (int j = 1; j < s.length(); j++) {
                if (i * j <= s.length() - 1) {
                    current = s.substring(i * j, Math.min(i * j + i, s.length()));
                } else {
                    if (count > 1) {
                        arr += count + temp;

                    } else
                        arr += temp;
                    break;
                }
                // String current = s.substring(i * j, Math.min(i * j + i, s.length()));

                // 같은 패턴일 때
                if (temp.equals(current)) {
                    count++;

                    // 밑에도 같은 거 있으니까 정리하기
                    if (j + 1 == s.length()) {
                        if (count > 1) {
                            arr += count + temp;
                            flag = false;
                        } else {
                            arr += temp;
                        }
                    }

                }
                // 같은 패턴이 아닐때
                else {

                    if (count > 1) {
                        arr += count + temp;
                    } else {
                        arr += temp;
                    }

                    temp = current;
                    count = 1;
                }
            }

            System.out.println(answer);
            if (arr.length() < answer) {
                answer = arr.length();
            }
            arr = "";

            if (answer + 1 == s.length() && flag) {
                answer = s.length();
            }
        }
        System.out.println(answer);
        // return answer;
    }
}
