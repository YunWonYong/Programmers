class Solution {
  public int[][] solution(int[][] arr1, int[][] arr2) {
    Matrix m = new Matrix(arr1);
    Matrix n = new Matrix(arr2);
    return m.add(n).toArray();
  }
}

class Vector {
  private int[] array;

  public Vector(int[] v) {
    array = v;
  }

  public Vector add(Vector v) {
    int[] xs = array;
    int[] ys = v.toArray();
    int[] zs = new int[array.length];
    for (int i = 0; i < array.length; i++)
      zs[i] = xs[i] + ys[i];
    return new Vector(zs);
  }

  public int[] toArray() {
    return array;
  }
}

class Matrix {
  private Vector[] vectors;

  public Matrix(int[][] m) {
    vectors = new Vector[m.length];
    for (int i = 0; i < m.length; i++)
      vectors[i] = new Vector(m[i]);
  }

  public Matrix(Vector[] v) {
    vectors = v;
  }

  public Vector[] getVectors() {
    return vectors;
  }

  public Matrix add(Matrix m) {
    int n = m.getVectors().length;
    Vector[] xs = vectors;
    Vector[] ys = m.getVectors();
    Vector[] zs = new Vector[n];
    for (int i = 0; i < n; i++)
      zs[i] = xs[i].add(ys[i]);
    return new Matrix(zs);
  }

  public int[][] toArray() {
    int n = vectors.length;
    int[][] array = new int[n][n];
    for (int i = 0; i < n; i++)
      array[i] = vectors[i].toArray();
    return array;
  }
}
