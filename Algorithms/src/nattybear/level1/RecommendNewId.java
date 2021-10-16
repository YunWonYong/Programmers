import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.*;

class Solution {

  Function<IntStream, String> streamToString = (stream) -> {
    StringBuilder builder = new StringBuilder();
    stream.forEach(c -> builder.append((char) c));
    return builder.toString();
  };

  Function<String, Character> getLastChar = (string) ->
    string.charAt(string.length() - 1);

  public String solution(String new_id) {
    IntStream stream = new_id.chars();
    IntStream result;

    result = one 
      .andThen(two)
      .andThen(three)
      .andThen(four)
      .andThen(five)
      .andThen(six)
      .andThen(seven)
      .apply(stream);

    return streamToString.apply(result);
  }

  Function<IntStream, IntStream> one = (stream) ->
    stream.map(c -> Character.toLowerCase(c)).skip(0);

  Function<IntStream, IntStream> two = (stream) ->
    stream.filter(c ->
      Pattern.matches("[a-z0-9_.-]", String.valueOf((char)c))).skip(0);

  Function<IntStream, IntStream> three = (stream) -> {
    String string = streamToString.apply(stream);
    return string.replaceAll("[.]{2,}", ".").chars();
  };

  Function<IntStream, IntStream> four = (stream) -> {
    String string = streamToString.apply(stream);
    return string
      .replaceFirst("^[.]", "")
      .replaceFirst("[.]$", "")
      .chars();
  };

  Function<IntStream, IntStream> five = (stream) -> {
    String string = streamToString.apply(stream);
    if (string.length() == 0)
      return "a".chars();
    else
      return string.chars();
  };

  Function<IntStream, IntStream> six = (stream) -> {
    String string = streamToString.apply(stream.limit(15));
    char last = getLastChar.apply(string);

    if (last == '.')
      return string.chars().limit(14);
    else
      return string.chars();
  };

  Function<IntStream, IntStream> seven = (stream) -> {
    String string = streamToString.apply(stream);
    char last = getLastChar.apply(string);
    IntStream a;

    if (string.length() < 3) {
      a = IntStream.generate(() -> last);
      return IntStream.concat(string.chars(), a).limit(3);
    }
    else
      return string.chars();
  };
}
