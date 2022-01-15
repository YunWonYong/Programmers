package main

import (
	"fmt"
	"sort"
	"strconv"
	"strings"
)

func main() {
	fmt.Println(solution(118372))
}

func solution(n int64) int64 {
	var str string = strconv.FormatInt(n, 10)
	arr := strings.Split(str, "")
	sort.Slice(arr, func(prev, next int) bool {
		return arr[prev] > arr[next]
	})

	str = ""

	for index := range arr {
		str += arr[index]
	}

	answer, _ := strconv.ParseInt(str, 0, 64)
	return answer
}
