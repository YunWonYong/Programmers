package main

import "fmt"

func main() {
	fmt.Println(solution(0))
	fmt.Println(solution(3))
	fmt.Println(solution(2))
}

func solution(num int64) string {
	switch num % 2 {
	case 0:
		return "Even"
	default:
		return "Odd"
	}
}
