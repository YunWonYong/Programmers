import java.util.*;
import java.util.stream.*;

class Solution {
  static Stream.Builder<IntStream> signs = Stream.builder();

  public int solution(int[] numbers, int target) {
    int depth = numbers.length;
    makeTree(IntStream.empty(), depth);
    return (int) signs
      .build()
      .map(xs -> zipWith(xs, numbers))
      .mapToInt(xs -> xs.sum())
      .filter(x -> x == target)
      .count();
  }

  static IntStream zipWith(IntStream xs, int[] numbers) {
    PrimitiveIterator.OfInt ys = xs.iterator();
    IntStream.Builder zs = IntStream.builder();
    for (int i = 0; i < numbers.length; i++) {
      int n = numbers[i];
      int y = ys.nextInt();
      int z = n * y;
      zs.add(z);
    }
    return zs.build();
  }

  static Tree makeTree(IntStream value, int depth) {
    if (depth == 0) {
      signs.add(value);
      return new Tree();
    }
    int[] xs = value.toArray();
    Tree left = makeTree(
      IntStream.concat(Arrays.stream(xs), IntStream.of(1)), depth - 1);
    Tree right = makeTree(
      IntStream.concat(Arrays.stream(xs), IntStream.of(-1)), depth - 1);
    return new Tree(value, left, right);
  }
}

class Tree {
  IntStream node;
  Tree left;
  Tree right;

  Tree() {}

  Tree(IntStream n, Tree l, Tree r) {
    node = n;
    left = l;
    right = r;
  }
}
