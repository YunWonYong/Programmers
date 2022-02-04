class Solution {
  public String solution(String phone_number) {
    int len = phone_number.length() - 4;
    return "*".repeat(len) + drop(len, phone_number);
  }

  static String drop(int n, String word) {
    return new String(word.chars().toArray(), n, word.length() - n);
  }
}
