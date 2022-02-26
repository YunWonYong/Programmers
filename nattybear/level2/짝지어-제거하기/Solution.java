import java.util.ArrayList;

class Solution {
  public int solution(String s) {
    Stack stack = new Stack();
    for (int i = 0; i < s.length(); i++)
      stack.push(s.charAt(i));
    if (stack.chars.isEmpty())
      return 1;
    else
      return 0;
  }
}

class Stack {
  ArrayList<Character> chars;

  Stack() {
    chars = new ArrayList<>();
  }

  void push(char c) {
    if (chars.isEmpty())
      chars.add(c);
    else {
      if (top() == c)
        pop();
      else
        chars.add(c);
    }
  }

  char top() {
    int i = chars.size() - 1;
    return chars.get(i);
  }

  void pop() {
    int i = chars.size() - 1;
    chars.remove(i);
  }
}
