
import java.io.*;

/*
계단 오르기 (2579)
 */
public class ClimbStairs {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        bw.write(String.valueOf(recursion(arr, n - 1)));
        bw.flush();
    }

    public static int recursion(int[] array, int index) {
        if (index == 0)
            return array[0];

        if (index == 1)
            return array[0] + array[1];

        if (index ==2)
            return Math.max(array[0], array[1]) + array[2];

        return Math.max(recursion(array, index - 2), recursion(array, index - 3) + array[index - 1]) + array[index];
    }
}
