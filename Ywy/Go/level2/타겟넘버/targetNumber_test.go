package targetNumber

import (
	"testing"
)

func TestSolution(t *testing.T) {
	numbers := [][]int{
		{1, 1, 1, 1, 1},
		{4, 1, 2, 1},
	}
	target := []int{
		3,
		4,
	}

	answers := []int{
		5, 2,
	}
	var result int

	for index, number := range numbers {
		result = solution(number, target[index])
		if result != answers[index] {
			t.Errorf("answer: %v, except: %v", answers[index], result)
		}
	}
}
