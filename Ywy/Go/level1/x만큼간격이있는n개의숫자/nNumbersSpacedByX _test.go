package nNumbersSpacedByX

import (
	"testing"
)

func TestSolution(t *testing.T) {
	arr := []int{2, 5, 4, 3, -4, 2}
	except := [][]int64{
		{2, 4, 6, 8, 10},
		{4, 8, 12},
		{-4, -8},
	}
	var answer []int64
	index2 := 0
	for index := 0; index < len(arr); index += 2 {
		answer = Solution(arr[index], arr[index+1])
		for index3, el := range except[index2] {
			if answer[index3] != el {
				t.Errorf("answer: %v, except: %v", answer, except[index2])
			}
		}
		index2++
	}
}
