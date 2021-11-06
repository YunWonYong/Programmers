package ywy.java.level1;

class PrimeFactory {
	private final int[] nums;
	private long[] resultArray = new long[1];
	public PrimeFactory(int[] nums) {
		this.nums = nums;
	}
	
	public void combine() {
		final int range = nums.length;
		int one = 0, two = 1, three = 2;
		long[] temps = new long[2];
		long temp = 0;
		
		do {
			if (three == range) {
				two++;
				three = two + 1;
			}
			if (two == range - 1) {
				one++;
				two = one + 1;
				three = two + 1;
			}
			if (one == range - 2) {
				break;
			}
			temp = nums[one];
			temps[0] = temp;
			temps[1] = nums[two];
			temp = temps[0] + temps[1];
			temp += nums[three++];
			if (temp % 2 == 0 || temp % 3 == 0) {
				continue;
			} 
			add(temp);
		} while(one < range);
	}
	private void add(long el) {
		int range = this.resultArray.length;
		this.resultArray[range - 1] = el;
		long[] temp = this.resultArray;
		this.resultArray = new long[range + 1];
		System.arraycopy(temp, 0, this.resultArray, 0, temp.length);
	}
	
	public int primeNumberCount() {
		int count = 0;
		int range = this.resultArray.length - 1;
		int index = 0;
		while(index < range) {
			if (isPrimeNumber(this.resultArray[index++])) {
				count++;
			}
		}
		return count;
	}

	
	private boolean isPrimeNumber(long num) {
		int no = 2;
		long range = num / 2;
		range--;
		System.out.print("num( "+ num + " ) is primeNumber Checked loop Count: ");
		int count = 0;
		while(no < range) {
			count++;
			if ( num % no++ == 0 || num % no++ == 0) {
				System.out.println(count);
				return false;
			}
		}
		System.out.println(count);
		return true;
	}
}

public class MakePrimeNumber {
	public int solution(final int[] nums) {
		PrimeFactory factory = new PrimeFactory(nums);
		factory.combine();
		return factory.primeNumberCount();
	}
}
