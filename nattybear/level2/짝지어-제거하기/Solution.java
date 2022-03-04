import java.util.ArrayList;
import java.util.Stack;

class Solution {
  public int solution(String s) {
    CStack stack = new CStack();
    for (int i = 0; i < s.length(); i++)
      stack.foo(s.charAt(i));
    if (stack.empty())
      return 1;
    else
      return 0;
  }
}

class CStack extends Stack<Character> {
  void foo(Character c) {
    if (empty())
      push(c);
    else {
      if (peek() == c)
        pop();
      else
        push(c);
    }
  }
}
