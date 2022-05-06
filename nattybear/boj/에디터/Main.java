import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter("\n");
    String s = sc.next();
    Zipper zipper = new Zipper(s);
    Editor editor = new Editor(zipper);
    int n = Integer.parseInt(sc.next());
    String command = null;
    for (int i = 0; i < n; i++) {
      command = sc.next();
      editor.run(command);
    }
    System.out.println(editor.getZipper());
  }
}

class Zipper {
  private Stack<Character> focus;
  private Stack<Character> crumb;

  public Zipper(String s) {
    focus = new Stack<>();
    crumb = new Stack<>();
    for (int i = 0; i < s.length(); i++)
      crumb.push(s.charAt(i));
  }

  public void goForward() {
    if (!focus.empty())
      crumb.push(focus.pop());
  }

  public void goBack() {
    if (!crumb.empty())
      focus.push(crumb.pop());
  }

  public void remove() {
    if (!crumb.empty())
      crumb.pop();
  }

  public void put(Character c) {
    crumb.push(c);
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    int n = crumb.size();
    for (int i = 0; i < n; i++)
      focus.push(crumb.pop());
    int m = focus.size();
    for (int i = 0; i < m; i++)
      builder.append(focus.pop());
    return builder.toString();
  }
}

class Editor {
  private Zipper zipper;

  public Editor(Zipper z) {
    zipper = z;
  }

  public void run(String line) {
    StringTokenizer st = new StringTokenizer(line);
    String command = st.nextToken();
    switch (command) {
      case "L":
        zipper.goBack();
        break;
      case "D":
        zipper.goForward();
        break;
      case "B":
        zipper.remove();
        break;
      case "P":
        char c = st.nextToken().charAt(0);
        zipper.put(c);
    }
  }

  public Zipper getZipper() {
    return zipper;
  }
}
