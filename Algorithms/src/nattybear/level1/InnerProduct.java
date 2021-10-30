package nattybear.level1;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

class InnerProduct {
  public int solution(int[] a, int[] b) {
    IntStream as = Arrays.stream(a);
    IntStream bs = Arrays.stream(b);
    return zipWith((x, y) -> x * y, as, bs).sum();
  }

  IntStream zipWith(BiFunction<Integer, Integer, Integer> f,
                    IntStream xs,
                    IntStream ys) {

    int[] as = xs.toArray();
    int[] bs = ys.toArray();

    if (as.length == 0 || bs.length == 0)
      return IntStream.empty();

    int a = as[0];
    int b = bs[0];

    IntStream single = IntStream.of(f.apply(a, b));

    IntStream cs = Arrays.stream(as).skip(1);
    IntStream ds = Arrays.stream(bs).skip(1);

    return IntStream.concat(single, zipWith(f, cs, ds));
  }
}
