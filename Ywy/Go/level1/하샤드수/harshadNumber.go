package harshadNumber

func Solution(x int) bool {
	sumNum := 0
	temp := x
	for {
		if temp == 0 {
			return x%sumNum == 0
		}
		sumNum += temp % 10
		temp /= 10
	}
}
