package nNumbersSpacedByX

func Solution(x, n int) []int64 {
	answer := make([]int64, n)
	int64X := int64(x)
	length := int64(n)
	for {
		if length == 0 {
			return answer
		}
		answer[length-1] = int64X * length
		length--
	}
}
