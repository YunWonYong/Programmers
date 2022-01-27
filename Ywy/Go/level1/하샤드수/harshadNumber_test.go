package harshadNumber

import (
	"testing"
)

func TestSolution(t *testing.T) {
	arr := []int{10, 12, 11, 13}
	except := []bool{true, true, false, false}
	var answer bool = false
	for index, el := range arr {
		answer = Solution(el)
		if answer != except[index] {
			t.Errorf("input: %d, answer: %v, except: %v", el, answer, except[index])
		}
	}
}
