package main

import (
	"fmt"
)

func main() {
	fmt.Println(solution([]int{4, 3, 2, 1}))
	fmt.Println(solution([]int{10}))

	fmt.Println(solution2([]int{4, 3, 2, 1}))
	fmt.Println(solution2([]int{10}))
}

func solution(arr []int) []int {
	minValueEl := arr[0]
	removeIndex := 0
	for index := range arr {

		if arr[index] < minValueEl {
			minValueEl = arr[index]
			removeIndex = index
		}
	}

	answer := append(arr[:removeIndex], arr[removeIndex+1:]...)

	if len(answer) == 0 {
		return []int{-1}
	}
	return answer
}

func solution2(arr []int) []int {
	size := len(arr)

	if size == 1 {
		return []int{-1}
	}

	minValueEl := arr[0]
	el := 0
	index := 0
	removeIndex := 0

	for {
		if index == size {
			return append(arr[:removeIndex], arr[removeIndex+1:]...)
		}

		el = arr[index]

		if el < minValueEl {
			minValueEl = el
			removeIndex = index
		}

		index++
	}
}
