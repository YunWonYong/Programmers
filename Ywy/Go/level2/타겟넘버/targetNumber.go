package targetNumber

func dfs(numbers []int, target, depth, sum int) int {
	if depth == len(numbers) {
		if sum == target {
			return 1
		}
		return 0
	}
	el := numbers[depth]
	depth++
	return dfs(numbers, target, depth, sum+el) + dfs(numbers, target, depth, sum-el)
}

func solution(numbers []int, target int) int {
	return dfs(numbers, target, 0, 0)
}
