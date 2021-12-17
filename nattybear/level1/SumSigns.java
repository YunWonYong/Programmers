package nattybear.level1;

class SumSigns {
  public int solution(int[] absolutes, boolean[] signs) {

    int size = signs.length;
    int sum = 0;

    for (int i = 0; i < size; i++) {
      if (signs[i])
        sum += absolutes[i];
      else
        sum += absolutes[i] * -1;
    }

    return sum;
  }
}
