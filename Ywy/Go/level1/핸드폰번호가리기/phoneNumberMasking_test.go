package phoneNumberMasking

import (
	"testing"
)

func TestSolution(t *testing.T) {
	arr := []string{"01033334444", "027778888", "4444"}
	except := []string{"*******4444", "*****8888", "4444"}
	var answer string = ""
	for index, el := range arr {
		answer = Solution(el)
		if answer != except[index] {
			t.Errorf("input: %v, answer: %v, except: %v", el, answer, except[index])
		}
	}
}
