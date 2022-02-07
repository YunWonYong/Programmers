import java.util.*;

class Solution {
  static ArrayList<String> buffer;
  static HashMap<String,String> map;

  public String[] solution(String[] record) {
    buffer = new ArrayList<>();
    map = new HashMap<>();

    Data[] datas = Arrays
      .stream(record)
      .map(Solution::parse)
      .toArray(Data[]::new);

    Arrays.stream(datas).forEach(Solution::assign);
    Arrays.stream(datas).forEach(Solution::print);

    return buffer.toArray(String[]::new);
  }

  static Data parse(String line) {
    String[] tokens = line.split(" ");
    String command = tokens[0];
    String id = tokens[1];
    String name = (tokens.length > 2) ? tokens[2] : "";
    return new Data(command, id, name);
  }

  static void assign(Data data) {
    String command = data.getCommand();
    if (command.equals("Enter") || command.equals("Change"))
      map.put(data.getId(), data.getName());
  }

  static void print(Data data) {
    String msg = "";
    switch (data.getCommand()) {
      case "Enter":
        msg = "님이 들어왔습니다.";
        break;
      case "Leave":
        msg = "님이 나갔습니다.";
        break;
      default:
        msg = "";
    }
    if (msg.length() > 0)
      buffer.add(map.get(data.getId()) + msg);
  }
}

class Data {
  private String command;
  private String id;
  private String name;

  public Data(String c, String i, String n) {
    command = c;
    id = i;
    name = n;
  }

  public String getCommand() {
    return command;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
