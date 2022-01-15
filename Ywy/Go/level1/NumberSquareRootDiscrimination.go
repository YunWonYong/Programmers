package main

import (
	"fmt"
	"math"
)

func main() {
	fmt.Println(solution(121))
	fmt.Println(solution(3))
	fmt.Println(solution(2))
}

func solution(num int64) int64 {
	sqrtNum := int64(math.Sqrt(float64(num)))
	if sqrtNum*sqrtNum == num {
		sqrtNum++
		return sqrtNum * sqrtNum
	}
	return -1
}
