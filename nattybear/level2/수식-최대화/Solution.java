import java.util.*;

class Solution {
  public long solution(String expression) {
    int[][] tables = new int[][] {
      {1, 2, 3},
      {1, 3, 2},
      {2, 1, 3},
      {2, 3, 1},
      {3, 1, 2},
      {3, 2, 1}
    };
    List<Long> answers = new ArrayList<>();
    for (int[] table : tables)
      answers.add(helper(expression, table));
    return answers.stream().reduce(Math::max).get();
  }

  long helper(String expression, int[] table) {
    Lexer lexer = new Lexer(expression, table);
    List<Token> tokens = lexer.getTokens();
    Tree tree = new Tree(tokens);
    return Math.abs(Interpreter.visit(tree));
  }
}

class Token {}

class Num extends Token {
  int value;

  Num(int n) {
    value = n;
  }
}

class Op extends Token {
  char value;
  int precedence;

  Op(char v, int[] table) {
    switch (v) {
      case '*':
        precedence = table[0];
        break;
      case '+':
        precedence = table[1];
        break;
      case '-':
        precedence = table[2];
        break;
    }
    value = v;
  }
}

class Lexer {
  String expression;
  int current;
  char look;
  int[] table;

  Lexer(String e, int[] t) {
    expression = e;
    current = 0;
    getChar();
    table = t;
  }

  void getChar() {
    if (current < expression.length())
      look = expression.charAt(current++);
    else
      look = ' ';
  }

  Num getNum() {
    StringBuilder builder = new StringBuilder();
    while (Character.isDigit(look)) {
      builder.append(look);
      getChar();
    }
    return new Num(Integer.parseInt(builder.toString()));
  }

  Op getOp() {
    Op op = new Op(look, table);
    getChar();
    return op;
  }

  List<Token> getTokens() {
    List<Token> tokens = new ArrayList<>();
    tokens.add(getNum());
    while (look != ' ') {
      tokens.add(getOp());
      tokens.add(getNum());
    }
    return tokens;
  }
}

class Tree {
  Tree left;
  Token node;
  Tree right;

  Tree(List<Token> tokens) {
    if (tokens.size() == 1)
      node = tokens.get(0);
    else {
      int min = minIndex(tokens);
      node = tokens.get(min);
      left = new Tree(tokens.subList(0, min));
      right = new Tree(tokens.subList(min+1, tokens.size()));
    }
  }

  int minIndex(List<Token> tokens) {
    int min = 0;
    for (int i = 0; i < tokens.size(); i++)
      if (tokens.get(i) instanceof Op) {
        min = i;
        break;
      }
    for (int i = 0; i < tokens.size(); i++) {
      if (tokens.get(i) instanceof Num)
        continue;
      Op op1 = (Op) tokens.get(min);
      Op op2 = (Op) tokens.get(i);
      if (op1.precedence >= op2.precedence)
        min = i;
    }
    return min;
  }
}

class Interpreter {
  static long visit(Tree tree) {
    long result = 0;
    if (tree.node instanceof Num)
      return ((Num)tree.node).value;
    Op op = (Op) tree.node;
    long left = visit(tree.left);
    long right = visit(tree.right);
    switch (op.value) {
      case '+':
        result = left + right;
        break;
      case '-':
        result = left - right;
        break;
      case '*':
        result = left * right;
        break;
    }
    return result;
  }
}
