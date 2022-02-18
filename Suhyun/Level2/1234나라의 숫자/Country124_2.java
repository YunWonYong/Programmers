public class Country124_2 {
    public static void main(String[] args) {
        int n = 4;
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int remainder = n % 3;

            if (remainder == 0) {
                sb.append(4);
            } else if (remainder == 1) {
                sb.append(1);
            } else {
                sb.append(2);
            }

            if (remainder == 0) {
                n = n - 1;
            }

            n /= 3;
        }

        // return sb.reverse().toString();
        System.out.println(sb.reverse().toString());

    }
}
