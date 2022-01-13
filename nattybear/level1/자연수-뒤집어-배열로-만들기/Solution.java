class Solution {
  public int[] solution(long n) {
    int[] arr = String.valueOf(n)
      .chars()
      .map(x -> Integer.parseInt(String.valueOf((char) x)))
      .toArray();
    return reverse(arr);
  }

  public int[] reverse(int[] arr) {
    int n = arr.length;
    int[] result = new int[n];
    for (int i = 0; i < n; i++)
      result[n - i - 1] = arr[i];
    return result;
  }
}
