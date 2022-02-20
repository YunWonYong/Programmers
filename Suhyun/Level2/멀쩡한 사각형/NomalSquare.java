public class NomalSquare {
    public static void main(String[] args) {
        int w = 8;
        int h = 12;

        long w2 = Long.valueOf(w);
        long h2 = Long.valueOf(h);
        long answer = (w2 * h2) - (w2 + h2 - gcd(w2, h2));
        // return answer;
    }

    public static long gcd(long w2, long h2) {
        while (h2 != 0) {
            long temp = w2 % h2;
            w2 = h2;
            h2 = temp;
        }
        return Math.abs(w2);
    }
}
