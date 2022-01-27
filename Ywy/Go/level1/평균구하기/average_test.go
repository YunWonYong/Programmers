package averege

import "testing"

// type casting count const 2
func TestSolution(t *testing.T) {
	arrs := [][]int{
		{1, 2, 3, 4},
		{5, 5},
	}
	excepts := []float64{2.5, 5}
	answer := 0.0
	for index, arr := range arrs {
		answer = Solution(arr)
		if answer != excepts[index] {
			t.Errorf("answer: %v != except: %v", answer, excepts[index])
		}
	}
}

func TestSolution2(t *testing.T) {
	arrs := [][]int{
		{1, 2, 3, 4},
		{5, 5},
	}
	excepts := []float64{2.5, 5}
	answer := 0.0
	for index, arr := range arrs {
		answer = Solution(arr)
		if answer != excepts[index] {
			t.Errorf("answer: %v != except: %v", answer, excepts[index])
		}
	}
}
