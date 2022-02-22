package functionDevelopment

import (
	"testing"
)

func TestSolution(t *testing.T) {
	progresses := [][]int{
		{93, 30, 55},
		{95, 90, 99, 99, 80, 99},
	}
	speeds := [][]int{
		{1, 30, 5},
		{1, 1, 1, 1, 1, 1},
	}

	answers := [][]int{
		{2, 1},
		{1, 3, 2},
	}
	var result []int

	for index, progresse := range progresses {
		result = solution(progresse, speeds[index])
		for index2, el := range answers[index] {
			if result[index2] != el {
				t.Errorf("answer: %v, except: %v", el, result[index2])
			}
		}
	}
}
