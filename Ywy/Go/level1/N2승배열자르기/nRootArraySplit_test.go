package nRootArraySplit

import (
	"testing"
)

func TestSolution(t *testing.T) {
	arrs := [][]int{
		{3, 2, 5},
		{4, 7, 14},
	}
	except := [][]int{
		{3, 2, 2, 3},
		{4, 3, 3, 3, 4, 4, 4, 4},
	}
	answer := make([]int, 0, 0)
	for index, arr := range arrs {
		answer = Solution(arr[0], int64(arr[1]), int64(arr[2]))
		for index2, el := range except[index] {
			if (answer[index2] != el) {
				t.Errorf("input: %v, answer: %v, except: %v", arr, answer, except[index])
			}
		}
	}
}
