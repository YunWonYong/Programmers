package level1;

abstract class Student {
	private int count = 0;

	public final int checking(int[] answers) {
		int index = 0;
		int range = answers.length;
		int answer = 0;
		do {
			answer = answers[index++];
			if (next() == answer) {
				count++;
			}
		} while(index < range);
		return count;
	}
	
	public boolean rankingSwapCheck(Student nextStudent) {
		if (getScore() == nextStudent.getScore()) {
			if (getID() > nextStudent.getID()) {
				return true;
			} 
			return false;
		}
		return getScore() < nextStudent.getScore(); 
	}
	
	public final int getScore() {
		return count;
	}
	
	public final int getID() {
		return getSeq();
	}
	
		
	public final boolean equals(Student obj) {
		if (obj != null && obj.getSeq() == this.getSeq()) {
			return true;
		}
		return false;
	}
	
	protected abstract int next();
	protected abstract int getSeq();
}

class GaveUpStudent extends Student{
	private int[] pattern;
	private int seq = 0;
	private int index = 0;
	private int range = 0;
	
	public GaveUpStudent(int[] pattern, int seq) {
		this.pattern = pattern;
		this.range = pattern.length;
		this.seq = seq;
	}

	@Override
	protected int getSeq() {
		return this.seq;
	}

	@Override
	protected int next() {
		if (range == index) {
			index = 0;
		}
		return pattern[index++];
	}
	
}

public class MockExam {
	public int[] solution(int[] answers) {
		Student[] students = new Student[] {
				new GaveUpStudent(new int[] {1, 2, 3, 4, 5}, 1),
				new GaveUpStudent(new int[] {2, 1, 2, 3, 2, 4, 2, 5}, 2), 
				new GaveUpStudent(new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}, 3) 
		};
		Student[] ranking = new Student[3];
		int index = 0;
		int range = students.length;
		int size = 0;
		Student student = null;
		boolean sortFlag = false;
		do {
			student = students[index]; 
			if(student.checking(answers) > 0) {
				sortFlag = true;
				ranking[size++] = student;
			}
			if (size > 1 && sortFlag) {
				sortFlag = false;
				ranking = sort(ranking, size);
			}
		} while((++index) < range);
		return size == 0 ? new int[] {} : getResult(ranking, size);
	}
	
	private Student[] sort(Student[] ranking, int size) {
		int index = 0;
		Student studentPrev = null;
		Student studentNext = null;
		size--;
		do {
			studentPrev = ranking[index];
			studentNext = ranking[index + 1];
			if (studentPrev.rankingSwapCheck(studentNext)) {
				ranking[index] = studentNext;
				ranking[index + 1] = studentPrev;
				if (index > 0) {
					index--;
				}
				continue;
			}
			index++;
		} while(index < size);
		return ranking;
	}
	
	private int[] getResult(Student[] ranking, int size) {
		final int[] result = new int[size];
		int index = 0;
		result[index] = ranking[index].getID();
		if ((size - 1) == 0) {
			return result;
		}
		while(++index < size) {
			if (ranking[index - 1].getScore() > ranking[index].getScore()) {
				return arrCopy(result, index);
			}
			result[index] = ranking[index].getID();
		}
		return result;
	}
	
	private int[] arrCopy(int[] result, int range) {
		int[] temp = new int[range];
		int index = 0;
		while ( index <  range ) {
			temp[index] = result[index++];
		}
		return temp;
	}
}
