package nattybear.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MathDumb {
	private static class Solution {
		public Integer[] solution(int[] answers) {

			int[] pattern1 = { 1, 2, 3, 4, 5 };
			int[] pattern2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
			int[] pattern3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

			Student one = new Student(1, pattern1);
			Student two = new Student(2, pattern2);
			Student three = new Student(3, pattern3);

			ArrayList<Student> students = new ArrayList<>();

			students.add(one);
			students.add(two);
			students.add(three);

			for (Student student : students)
				student.grade(answers);

			int max = students.stream().map(student -> student.getScore()).reduce(0, (x, y) -> Integer.max(x, y));

			Integer[] answer = students.stream().filter(student -> student.getScore() == max)
					.sorted(Comparator.comparing(Student::getName)).map(student -> student.getName())
					.toArray(Integer[]::new);

			return answer;
		}
	}

	private static class Student {
		private int name;
		private int[] pattern;
		private int score = 0;

		public Student(int n, int[] p) {
			name = n;
			pattern = p;
		}

		public int getName() {
			return name;
		}

		public int getScore() {
			return score;
		}

		public void grade(int[] answers) {
			for (int i = 0; i < answers.length; i++) {
				int answer = answers[i];
				int submit = pattern[i % pattern.length];
				if (answer == submit)
					score++;
			}
		}
	}

	public static void main(String[] args) {

		Solution s = new Solution();

		int[][] answers = { { 1, 2, 3, 4, 5 }, { 1, 3, 2, 4, 2 }, };

		for (int[] answer : answers) {
			Arrays.stream(s.solution(answer)).forEach(System.out::print);
			System.out.println();
		}
	}
}
