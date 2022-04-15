import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

    int n = Integer.parseInt(tokenizer.nextToken());
    int m = Integer.parseInt(tokenizer.nextToken());

    int[] targets = new int[m];

    tokenizer = new StringTokenizer(reader.readLine());

    for (int i = 0; i < m; i++)
      targets[i] = Integer.parseInt(tokenizer.nextToken());

    Queue queue = new Queue(n);

    for (int target : targets)
      queue.rotate(target);

    System.out.println(queue.getAnswer());
  }
}

class Queue {
  private List<Integer> queue;
  private int answer;

  public Queue(int n) {
    queue = new ArrayList<>(n);
    for (int i = 1; i <= n; i++)
      queue.add(i);
  }

  public int pop() {
    return queue.remove(0);
  }

  public void left() {
    int value = pop();
    queue.add(value);
    answer++;
  }

  public void right() {
    int size = queue.size();
    int value = queue.get(size - 1);
    queue.remove(size - 1);
    queue.add(0, value);
    answer++;
  }

  public void rotate(int target) {
    int targetIndex = queue.indexOf(target);
    int size = queue.size();
    if (targetIndex <= size / 2)
      for (int i = 0; i < targetIndex; i++)
        left();
    else
      for (int i = 0; i < size - targetIndex; i++)
        right();
    pop();
  }

  public int getAnswer() {
    return answer;
  }
}
