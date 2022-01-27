package gcdAndLcm

import (
	"testing"
)

func TestSolution(t *testing.T) {
	arrs := [][]int{
		{3, 12},
		{2, 5},
	}
	except := [][]int{
		{3, 12},
		{1, 10},
	}
	var answer []int
	for index, arr := range arrs {
		answer = Solution(arr[0], arr[1])
		if answer[0] != except[index][0] || answer[1] != except[index][1] {
			t.Errorf("input: %d, answer: %v, except: %v", index, answer, except[index])
		}
	}
}
