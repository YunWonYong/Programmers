import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger n = sc.nextBigInteger();
    BigInteger ONE = BigInteger.ONE;
    BigInteger TWO = ONE.add(ONE);
    System.out.println(
      ( n.compareTo(TWO) == 1 )
      ? n.multiply(TWO).subtract(TWO)
      : n
    );
  }
}
