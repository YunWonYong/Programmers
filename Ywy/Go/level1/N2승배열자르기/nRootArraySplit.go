package nRootArraySplit

func Solution(n int, left int64, right int64) []int {
	x := int64(n)
	row := left / x
	col := left % x
	left--;
	cap := int(right - left)
	answer := make([]int, cap, cap)
	index := 0
	temp := int64(0)
	for row < x {
		row++
		for col < x {
			temp = col + 1
			if row > temp {
				temp = row
			}
			answer[index] = int(temp)
			index++
			col++
			if index == cap {
				return answer
			}
		}
		col = 0
	}
	return answer;
}
