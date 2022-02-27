package Level2.타겟넘버;

public class TargetNumber {
    int[] arr;
    int answer = 0;

    public int main(String[] args) {
        int[] numbers = { 1, 1, 1, 1, 1 };
        int target = 3;

        int[] arr;
        int answer = 0;

        arr = numbers;

        dfs(0, 0, target);

        // return answer;

    }

    public void dfs(int sum, int i, int target) {
        if (i == arr.length) {
            if (sum == target)
                answer++;
            return;
        }

        dfs(sum + arr[i], i + 1, target);
        dfs(sum - arr[i], i + 1, target);
    }
}