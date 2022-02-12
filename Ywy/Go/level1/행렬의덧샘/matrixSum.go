package matrixSum

func Solution1(arr1 [][]int, arr2 [][]int) [][]int {
	answer := make([][]int, len(arr1))
	for i, arr := range arr1 {
		answer[i] = make([]int, len(arr))
		for j, el := range arr {
			answer[i][j] = el + arr2[i][j]
		}
	}
	return answer
}

func Solution2(arr1 [][]int, arr2 [][]int) [][]int {
	for i := range arr1 {
		for j := range arr1[i] {
			arr1[i][j] += arr2[i][j]
		}
	}
	return arr1
}
