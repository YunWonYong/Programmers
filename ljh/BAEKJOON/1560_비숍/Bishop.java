package Programmers.test;

import java.io.*;
import java.math.BigInteger;

public class Bishop {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger n = new BigInteger(br.readLine());
        if (n.compareTo(new BigInteger("1")) == 0) {
            bw.write("1");
        } else {
            BigInteger two = new BigInteger("2");
            bw.write(n.multiply(two).subtract(two).toString());
        }
        bw.flush();
    }
}
