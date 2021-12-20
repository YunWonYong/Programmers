function solution(s) {
  const size = s.length;

  let cursor = 0;
  let result = "";

  while (cursor < size) {
    let c = s[cursor++];

    if (c >= '0' && c <= '9') {
      result += c;
    }
    else if (c == 'o') {
      result += '1';
      cursor += 2;
    }
    else if (c == 't') {
      if (s[cursor++] == 'w') {
        result += '2';
        cursor++;
      }
      else {
        result += '3';
        cursor += 3;
      }
    }
    else if (c == 'f') {
      if (s[cursor++] == 'o') {
        result += '4';
        cursor += 2;
      }
      else {
        result += '5';
        cursor += 2;
      }
    }
    else if (c == 's') {
      if (s[cursor++] == 'i') {
        result += '6';
        cursor++;
      }
      else {
        result += '7';
        cursor += 3;
      }
    }
    else if (c == 'e') {
      result += '8';
      cursor += 4;
    }
    else if (c == 'n') {
      result += '9';
      cursor += 3;
    }
    else if (c == 'z') {
      result += '0';
      cursor += 3;
    }
  }

  return Number(result);
}
