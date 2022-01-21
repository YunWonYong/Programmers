package colatzGuess

import (
	"testing"
)

func TestSolution(t *testing.T) {
	arr := []int{ 6, 16, 626331 }
	except := []int{ 8, 4, -1 }
	var answer int = 0
	for index, el := range arr {
		answer = solution(el)
		if answer != except[index] {
			t.Errorf("input: %d, answer: %d, except: %d", el, answer, except[index])
		}
	}
}

func TestSolution2(t *testing.T) {
	arr := []int{ 6, 16, 626331 }
	except := []int{ 8, 4, -1 }
	var answer int = 0
	for index, el := range arr {
		answer = Solution(el)
		if answer != except[index] {
			t.Errorf("input: %d, answer: %d, except: %d", el, answer, except[index])
		}
	}
}
