package level2;

public class TargetNumber {
	private int target;
	private int range;
	private int[] numbers;
	public int solution(final int[] numbers, final int target) {
		this.target = target;
		this.range = numbers.length;
		this.numbers = numbers;
		return dfs(0, 0);
    }

    private int dfs(int depth, int sum) {
        if (depth == range) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }
        int el = numbers[depth++];
        return dfs(depth, sum + el) + dfs(depth, sum - el);
    }
}
